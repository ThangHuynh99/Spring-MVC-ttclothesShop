package com.laptrinhjavaweb.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "productsize")
public class ProductSizeEntity extends BaseEntity{
	
	@ManyToMany(mappedBy = "size")
	private List<ProductEntity> products = new ArrayList<>();
	
	@ManyToMany
	@JoinTable(name = "size_color", joinColumns = @JoinColumn(name = "size_id"), inverseJoinColumns = @JoinColumn(name = "color_id"))
	private List<ProductColorEntity> colors = new ArrayList<>();
	
	@Column(name = "size", length = 10)
	private String size;
	
	@Column(name = "quantity")
	private Long productQuantity;

	public List<ProductEntity> getProducts() {
		return products;
	}

	public void setProducts(List<ProductEntity> products) {
		this.products = products;
	}

	public List<ProductColorEntity> getColors() {
		return colors;
	}

	public void setColors(List<ProductColorEntity> colors) {
		this.colors = colors;
	}

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
