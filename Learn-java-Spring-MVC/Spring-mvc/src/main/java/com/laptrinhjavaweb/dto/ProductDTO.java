package com.laptrinhjavaweb.dto;

import java.util.ArrayList;
import java.util.List;


public class ProductDTO extends AbstractDTO<ProductDTO>{
	private String title = "product";
	private String productName;
	private String content;
	private String shortDescription;
	private Long view;
	private Double price;
	private String productCode;
	private String vnd;
	private String productColor;
	private List<ProductImageDTO> productImage = new ArrayList<>();
	private List<Product_Size_DTO> product_size = new ArrayList<>();
	private CatalogDTO catalog;
	private ProductBrandDTO brands;
	private String imageName;
	private String imageFile;
	private String size;
	private String catalogCode;
	private Long quantity;
	
	
	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getCatalogCode() {
		return catalogCode;
	}

	public void setCatalogCode(String catalogCode) {
		this.catalogCode = catalogCode;
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

	public CatalogDTO getCatalog() {
		return catalog;
	}

	public void setCatalog(CatalogDTO catalog) {
		this.catalog = catalog;
	}

	public ProductBrandDTO getBrands() {
		return brands;
	}

	public void setBrands(ProductBrandDTO brands) {
		this.brands = brands;
	}

	public List<Product_Size_DTO> getProduct_size() {
		return product_size;
	}

	public void setProduct_size(List<Product_Size_DTO> product_size) {
		this.product_size = product_size;
	}

	public String getProductColor() {
		return productColor;
	}

	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public List<ProductImageDTO> getProductImage() {
		return productImage;
	}

	public void setProductImage(List<ProductImageDTO> productImage) {
		this.productImage = productImage;
	}
	
}
