package com.laptrinhjavaweb.service.impl;

import com.laptrinhjavaweb.util.SecurityUtils;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptrinhjavaweb.converter.OrderConverter;
import com.laptrinhjavaweb.dto.GioHangDTO;
import com.laptrinhjavaweb.dto.OrderDTO;
import com.laptrinhjavaweb.entity.OrderEntity;
import com.laptrinhjavaweb.entity.ProductEntity;
import com.laptrinhjavaweb.entity.ProductOrderEntity;
import com.laptrinhjavaweb.entity.ProductOrderKey;
import com.laptrinhjavaweb.entity.ProductSizeEntity;
import com.laptrinhjavaweb.entity.UserEntity;
import com.laptrinhjavaweb.repository.OrderRepository;
import com.laptrinhjavaweb.repository.ProductOrderRepository;
import com.laptrinhjavaweb.repository.ProductRepository;
import com.laptrinhjavaweb.repository.ProductSizeRepository;
import com.laptrinhjavaweb.repository.UserRepository;
import com.laptrinhjavaweb.service.IOrderService;

@Service
public class OrderService implements IOrderService {
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private OrderConverter orderConverter;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private ProductSizeRepository sizeRepository;
	
	@Autowired
	private ProductOrderRepository productOrderRepository;
	
	@Transactional
	@Override
	public OrderDTO save(OrderDTO order, HttpSession session) {	
		 
		String userName = SecurityUtils.getPrincipal().getUsername();
		UserEntity user = null;
		OrderEntity orderEntity = orderConverter.toEntity(order);
		
		//kiểm tra nếu tồn tại user thì lưu quan hệ giữa bảng user và order.
		if(userName != null) {
			user = userRepository.findOneByUserNameAndStatus(userName, 1);
		}
		
		if(user != null) {
			orderEntity.setUsers(user);
			orderEntity = orderRepository.save(orderEntity);
			order = orderConverter.toDTO(orderRepository.save(orderEntity));
		}else {
			order = orderConverter.toDTO(orderRepository.save(orderEntity));
		}
	
		
		List<GioHangDTO> giohang = (List<GioHangDTO>) session.getAttribute("giohang");
		
		//thay đổi lại số lượng của sản phẩm theo size
		for(GioHangDTO gio : giohang) {
			ProductEntity productEntity = productRepository.findOne(gio.getId());
			long idSize = 0;
			//tim id cua bang productSize mà muốn thay đổi số lượng của size đó.
			for(ProductSizeEntity id : productEntity.getSize()) {
				if(gio.getProductSize().equals(id.getSize())) {
					idSize = id.getId();
					break;
				}
			}
			
			//tim size theo productId  vaf productSize
			List<ProductSizeEntity> sizeEntity = sizeRepository.findByIdAndSize(idSize, gio.getProductSize());
			//set lại số lượng cho sản phẩm có size ...
			sizeEntity.get(0).setProductQuantity(sizeEntity.get(0).getProductQuantity() - gio.getProductQuantity());
			productEntity.setSize(sizeEntity);
			//lưu lại sản phẩm với size ... với số lượng mới.
			productRepository.save(productEntity);
			
			//set key cho bảng ProductOrder
			ProductOrderKey productOrderKey = ProductOrderKey.getInstance();
			productOrderKey.setOrderId(order.getId());
			productOrderKey.setProductId(productEntity.getId());
			
			ProductOrderEntity productOrder = ProductOrderEntity.getInstance();
			productOrder.setQuantity(gio.getProductQuantity());
			productOrder.setOrder(orderEntity);
			productOrder.setProduct(productEntity);
			productOrder.setId(productOrderKey);
			
			//set lại quan hệ giữa bảng product và bảng order
			productOrderRepository.save(productOrder);
		}
		return order;
	}
}
