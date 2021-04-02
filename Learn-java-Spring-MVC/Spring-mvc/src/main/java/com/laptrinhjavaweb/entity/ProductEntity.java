package com.laptrinhjavaweb.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class ProductEntity extends BaseEntity {

	@Column(name = "productname")
	private String productName;

	@Column(name = "content" /* length = 100 */)
	private String content;

	@Column(name = "shortdescription", columnDefinition = "TEXT")
	private String shortDescription;

	@Column(name = "view")
	private Long view; // luot xem san pham

	@Column(name = "price")
	private Double price;

	@Column(name = "productCode")
	private String productCode;
	
	
	// quan he voi bang order
	@ManyToMany(mappedBy = "products")
	private List<OrderEntity> orders = new ArrayList<>();

	// quan he voi bang catalog
	@ManyToOne
	@JoinColumn(name = "catalog_id")
	private CatalogEntity catalog;

	
	// quan he voi bang image
	@OneToMany(mappedBy = "product") // duoc khai bao o bang nhieu (ProductImageEntity)
	private List<ProductImageEntity> image = new ArrayList<>();

	// quan he voi bang productbrand
	@ManyToOne
	@JoinColumn(name = "pbrand_id")
	private ProductBrandEntity brands;

	// quan he voi bang promotion
	@ManyToMany
	@JoinTable(name = "product_promotion", joinColumns = @JoinColumn(name = "product_id"), inverseJoinColumns = @JoinColumn(name = "promotion_id"))
	private List<PromotionEntity> promotions = new ArrayList<>();

	// quan he voi bang productsize
	@ManyToMany
	@JoinTable(name = "product_size", joinColumns = @JoinColumn(name = "product_id"), inverseJoinColumns = @JoinColumn(name = "size_id"))
	private List<ProductSizeEntity> size = new ArrayList<>();

	
	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public List<OrderEntity> getOrders() {
		return orders;
	}

	public void setOrders(List<OrderEntity> orders) {
		this.orders = orders;
	}

	public CatalogEntity getCatalog() {
		return catalog;
	}

	public void setCatalog(CatalogEntity catalog) {
		this.catalog = catalog;
	}

	public ProductBrandEntity getBrands() {
		return brands;
	}

	public void setBrands(ProductBrandEntity brands) {
		this.brands = brands;
	}

	public List<PromotionEntity> getPromotions() {
		return promotions;
	}

	public void setPromotions(List<PromotionEntity> promotions) {
		this.promotions = promotions;
	}

	public List<ProductSizeEntity> getSize() {
		return size;
	}

	public void setSize(List<ProductSizeEntity> size) {
		this.size = size;
	}

	public List<ProductImageEntity> getImage() {
		return image;
	}

	public void setImage(List<ProductImageEntity> image) {
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

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
