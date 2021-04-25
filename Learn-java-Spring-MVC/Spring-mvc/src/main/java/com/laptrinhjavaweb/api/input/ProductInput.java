package com.laptrinhjavaweb.api.input;

import java.util.ArrayList;
import java.util.List;

import com.laptrinhjavaweb.dto.CatalogDTO;
import com.laptrinhjavaweb.dto.ProductImageDTO;
import com.laptrinhjavaweb.dto.Product_Size_DTO;

public class ProductInput {
	private Long id;
	private String productName;
	private String content;
	private String shortDescription;
	private Long view;
	private Double price;
	private String productCode;
	private String vnd;
	private String productColor;
	private String imageName;
	private String imageFile;
	private String size;
	private String catalogCode;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getVnd() {
		return vnd;
	}
	public void setVnd(String vnd) {
		this.vnd = vnd;
	}
	public String getProductColor() {
		return productColor;
	}
	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	public String getImageFile() {
		return imageFile;
	}
	public void setImageFile(String imageFile) {
		this.imageFile = imageFile;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getCatalogCode() {
		return catalogCode;
	}
	public void setCatalogCode(String catalogCode) {
		this.catalogCode = catalogCode;
	}
	
}
