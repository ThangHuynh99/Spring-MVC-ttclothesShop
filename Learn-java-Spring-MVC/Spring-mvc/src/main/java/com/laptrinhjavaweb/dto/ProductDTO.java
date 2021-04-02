package com.laptrinhjavaweb.dto;

import java.util.ArrayList;
import java.util.List;

public class ProductDTO extends AbstractDTO<ProductDTO>{
	private String productName;
	private String content;
	private String shortDescription;
	private Long view;
	private String price;
	private String productCode;
	private String vnd;
	private List<ProductImageDTO> image = new ArrayList<>();
	private List<ProductSizeDTO> size = new ArrayList<>();
	
	
	public List<ProductSizeDTO> getSize() {
		return size;
	}

	public void setSize(List<ProductSizeDTO> size) {
		this.size = size;
	}

	public String getVnd() {
		return vnd;
	}

	public void setVnd(String vnd) {
		this.vnd = vnd;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public List<ProductImageDTO> getImage() {
		return image;
	}

	public void setImage(List<ProductImageDTO> image) {
		this.image = image;
	}

	public List<ProductImageDTO> getProductImage() {
		return image;
	}

	public void setProductImage(List<ProductImageDTO> image) {
		this.image = image;
	}

	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getShortDescription() {
		return shortDescription;
	}
	
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	
	public Long getView() {
		return view;
	}
	
	public void setView(Long view) {
		this.view = view;
	}
	
	public String getPrice() {
		return price;
	}
	
	public void setPrice(String price) {
		this.price = price;
	}
	
}
