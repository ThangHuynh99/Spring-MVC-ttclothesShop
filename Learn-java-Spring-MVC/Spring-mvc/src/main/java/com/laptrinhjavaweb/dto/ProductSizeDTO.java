package com.laptrinhjavaweb.dto;

public class ProductSizeDTO extends AbstractDTO<ProductSizeDTO>{
	
	private String size;
	private Long productQuantity;
	
	public String getSize() {
		return size;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	
	public Long getProductQuantity() {
		return productQuantity;
	}
	
	public void setProductQuantity(Long productQuantity) {
		this.productQuantity = productQuantity;
	}
	
	
}
