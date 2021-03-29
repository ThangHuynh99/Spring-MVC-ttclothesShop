package com.laptrinhjavaweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptrinhjavaweb.converter.ProductConverter;
import com.laptrinhjavaweb.dto.ProductDTO;
import com.laptrinhjavaweb.entity.ProductEntity;
import com.laptrinhjavaweb.repository.ProductRepository;
import com.laptrinhjavaweb.service.IProductService;

@Service
public class ProductService implements IProductService{

	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private ProductConverter productConverter;
	
	@Override
	public List<ProductDTO> findByCatalogId(Long id) {
		List<ProductDTO> productDTO = new ArrayList<>();
		List<ProductEntity> productEntity = productRepository.findByCatalogId(id);
		for(ProductEntity item: productEntity) {
			
			productDTO.add(productConverter.toDTO(item));
			
		}
		return productDTO;
	}
	
}
