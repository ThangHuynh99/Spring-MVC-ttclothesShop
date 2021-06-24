package com.laptrinhjavaweb.api.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhjavaweb.api.input.ProductInput;
import com.laptrinhjavaweb.dto.ProductDTO;
import com.laptrinhjavaweb.service.IProductService;

@RestController
@RequestMapping("/api")
public class ProductAPI {
	@Autowired
	private IProductService productService;
	
	@PostMapping("/product")
	public ProductDTO addProduct(@RequestBody ProductDTO product) {
		ProductDTO productDTO = productService.saveOrUpdate(product);
		return productDTO;
	}
	
	@PutMapping(value = "/product")
	public ProductDTO updateProduct(@RequestBody ProductDTO product) {
		ProductDTO productDTO = productService.saveOrUpdate(product);
		return productDTO;
	}
	
	@GetMapping("/product")
	public List<ProductDTO> getProduct() {
		return productService.findAll();
	}
}
