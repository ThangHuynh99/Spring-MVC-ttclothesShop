package com.laptrinhjavaweb.dto;

public class ProductDTO extends AbstractDTO<ProductDTO>{
	private String productName;
	private String content;
	private String shortDescription;
	private Long view;
	private Double price;
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
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
}
