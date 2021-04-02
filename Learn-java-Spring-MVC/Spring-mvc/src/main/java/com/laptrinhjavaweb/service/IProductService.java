package com.laptrinhjavaweb.service;

import java.util.List;

import com.laptrinhjavaweb.dto.ProductDTO;

public interface IProductService {
	List<ProductDTO> findByCatalogId(String name);
	ProductDTO findByProductCode(String productCode);
}
