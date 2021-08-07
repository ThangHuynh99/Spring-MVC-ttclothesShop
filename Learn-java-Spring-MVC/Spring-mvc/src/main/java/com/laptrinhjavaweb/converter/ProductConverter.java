package com.laptrinhjavaweb.converter;

import java.text.NumberFormat;
import java.util.Locale;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.dto.ProductDTO;
import com.laptrinhjavaweb.entity.ProductEntity;

@Component
public class ProductConverter {
	@Autowired
	private ModelMapper mapper;
	
	public ProductDTO toDTO(ProductEntity product) {
		ProductDTO productDTO = mapper.map(product, ProductDTO.class);
		Locale localeVN = new Locale("vi", "VN");
		NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
		if(product.getPrice() != 0) {
			productDTO.setVnd((currencyVN.format(product.getPrice())));
		} else {
			productDTO.setVnd(currencyVN.format(0));
		}
		return productDTO;
	}
	
	public ProductEntity toEntity(ProductDTO product) {
		ProductEntity productEntity = mapper.map(product, ProductEntity.class);
		return productEntity;
	}
	
	public ProductEntity toEntity(ProductDTO product, ProductEntity entity) {
		entity.setPrice(product.getPrice());
		entity.setContent(product.getContent());
		entity.setProductName(product.getProductName());
		entity.setProductCode(product.getProductCode());
		entity.setProductColor(product.getProductColor());
		entity.setShortDescription(product.getShortDescription());
		return entity;
	}
}
