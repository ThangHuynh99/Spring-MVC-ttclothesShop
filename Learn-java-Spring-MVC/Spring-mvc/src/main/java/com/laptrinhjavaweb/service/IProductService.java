package com.laptrinhjavaweb.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.laptrinhjavaweb.api.input.ProductInput;
import com.laptrinhjavaweb.dto.ProductDTO;
import com.laptrinhjavaweb.entity.ProductEntity;

public interface IProductService {
	List<ProductDTO> findByCatalogId(String name, Pageable page);
	int countTotalItem(String productCode);
	ProductDTO findByProductCode(String productCode);
	ProductDTO save(ProductDTO product);
	ProductDTO findOne(Long id);
	ProductDTO saveOrUpdate(ProductDTO product);
	List<ProductDTO> findAll();
	List<ProductDTO> findByCatalogIdAndProductNameContaining(String catalogCode, String productName, Pageable page);
	List<ProductDTO> findBycatalogIdAndPriceBetween(String catalogCode, Double startPrice, Double endPrice, Pageable page);
}
