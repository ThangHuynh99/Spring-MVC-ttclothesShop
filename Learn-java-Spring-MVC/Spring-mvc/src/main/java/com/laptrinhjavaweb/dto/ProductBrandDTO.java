package com.laptrinhjavaweb.dto;

public class ProductBrandDTO extends AbstractDTO<ProductBrandDTO>{
	private String brandCode;
	private String brandName;
	
	public String getBrandCode() {
		return brandCode;
	}
	
	public void setBrandCode(String brandCode) {
		this.brandCode = brandCode;
	}
	
	public String getBrandName() {
		return brandName;
	}
	
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	
}
