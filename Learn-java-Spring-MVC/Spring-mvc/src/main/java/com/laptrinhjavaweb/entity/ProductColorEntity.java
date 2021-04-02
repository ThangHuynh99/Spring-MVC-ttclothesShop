package com.laptrinhjavaweb.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "productcolor")
public class ProductColorEntity extends BaseEntity{
	
	@ManyToMany(mappedBy = "colors")
	private List<ProductSizeEntity> sizes = new ArrayList<>();
	
	
	@Column(name = "color", length = 50)
	private String color;
	
	@Column(name = "code", length = 50)
	private String code;

	public List<ProductSizeEntity> getSizes() {
		return sizes;
	}

	public void setSizes(List<ProductSizeEntity> sizes) {
		this.sizes = sizes;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
}

