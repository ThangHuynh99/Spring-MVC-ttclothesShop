package com.laptrinhjavaweb.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.laptrinhjavaweb.api.input.ProductInput;
import com.laptrinhjavaweb.dto.ProductDTO;

public interface IProductService {
	List<ProductDTO> findByCatalogId(String name, Pageable page);
	int countTotalItem(String productCode);
	ProductDTO findByProductCode(String productCode);
	ProductDTO save(ProductDTO product);
	ProductDTO findOne(Long id);
	ProductDTO saveOrUpdate(ProductDTO product);
}
