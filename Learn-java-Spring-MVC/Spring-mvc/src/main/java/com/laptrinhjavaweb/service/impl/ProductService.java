package com.laptrinhjavaweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.criterion.SizeExpression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.laptrinhjavaweb.api.input.ProductInput;
import com.laptrinhjavaweb.converter.ProductConverter;
import com.laptrinhjavaweb.dto.ProductDTO;
import com.laptrinhjavaweb.entity.CatalogEntity;
import com.laptrinhjavaweb.entity.ProductBrandEntity;
import com.laptrinhjavaweb.entity.ProductEntity;
import com.laptrinhjavaweb.entity.ProductImageEntity;
import com.laptrinhjavaweb.entity.ProductSizeEntity;
import com.laptrinhjavaweb.entity.Product_Size_Entity;
import com.laptrinhjavaweb.repository.CatalogRepository;
import com.laptrinhjavaweb.repository.ProductBrandRepository;
import com.laptrinhjavaweb.repository.ProductRepository;
import com.laptrinhjavaweb.repository.ProductSizeRepository;
import com.laptrinhjavaweb.service.IProductService;

@Service
public class ProductService implements IProductService{

	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private ProductConverter productConverter;
	@Autowired
	private CatalogRepository catalogRepository;
	@Autowired
	private ProductBrandRepository productBrandRepository;
	@Autowired
	private ProductSizeRepository sizeRepository;
	
	@Override
	public List<ProductDTO> findByCatalogId(String name, Pageable page) {
		List<ProductDTO> productDTO = new ArrayList<>();
		CatalogEntity catalog = catalogRepository.findByCatalogCode(name);
		List<ProductEntity> productEntity = productRepository.findByCatalogId(catalog.getId(), page);
		for(ProductEntity item: productEntity) {		
			productDTO.add(productConverter.toDTO(item));
		}
		return productDTO;
	}

	@Override
	public ProductDTO findByProductCode(String productCode) {
		ProductEntity productEntity = productRepository.findByProductCode(productCode);
		return 	productConverter.toDTO(productEntity);
	}

	@Override
	public int countTotalItem(String catalogCode) {
		CatalogEntity catalog = catalogRepository.findByCatalogCode(catalogCode);
		return (int) productRepository.countByCatalogId(catalog.getId());
	}

	@Override
	public ProductDTO save(ProductDTO product) {
		ProductEntity entity = new ProductEntity();
		entity = productConverter.toEntity(product);
		ProductBrandEntity brandEntity = productBrandRepository.findOne(product.getBrands().getId());
		CatalogEntity catalogEntity = catalogRepository.findOne(product.getCatalog().getId());
		entity.setBrands(brandEntity);
		entity.setCatalog(catalogEntity);
		product = productConverter.toDTO(productRepository.save(entity));
		return product;
	}

	@Override
	public ProductDTO findOne(Long id) {
		ProductDTO product = productConverter.toDTO(productRepository.findOne(id));
		return product;
	}

	@Override
	public ProductDTO saveOrUpdate(ProductDTO product) {
		ProductEntity productEntity = new ProductEntity();
		List<ProductImageEntity> productImage = new ArrayList();
		if(product.getId() == null) {
			CatalogEntity catalogEntity = catalogRepository.findByCatalogCode(product.getCatalogCode());
			ProductSizeEntity sizeEntity = sizeRepository.findBySize(product.getSize());
			ProductImageEntity productImageEntity = new ProductImageEntity();
			productImageEntity.setImageName(product.getImageName());
			productImageEntity.setFile(product.getImageFile());
			productImage.add(productImageEntity);
			productEntity = productRepository.save(productConverter.toEntity(product));
			
			
			Product_Size_Entity product_size_Entity = new Product_Size_Entity();
			product_size_Entity.setProductss(productEntity);
			product_size_Entity.setSizess(sizeEntity);
			product_size_Entity.setQuantity(product.getQuantity());
		} else {
			
		}
		
		return productConverter.toDTO(productEntity);
	}
	
}
