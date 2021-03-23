package com.laptrinhjavaweb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "catalogType")
public class CatalogTypeEntity extends BaseEntity{
	
	@Column(name = "detailproducttype")
	private String detailProductType;
	
	@Column(name = "detailproductname")
	private String detailProductName;
	
	@ManyToOne
	@JoinColumn(name = "catalog_id")
	private CatalogEntity catalogs;

	public String getDetailProductType() {
		return detailProductType;
	}

	public void setDetailProductType(String detailProductType) {
		this.detailProductType = detailProductType;
	}

	public String getDetailProductName() {
		return detailProductName;
	}

	public void setDetailProductName(String detailProductName) {
		this.detailProductName = detailProductName;
	}

	public CatalogEntity getCatalog() {
		return catalogs;
	}

	public void setCatalog(CatalogEntity catalogs) {
		this.catalogs = catalogs;
	}
	
}
