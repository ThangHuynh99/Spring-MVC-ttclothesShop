package com.laptrinhjavaweb.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orderTable")
public class OrderEntity extends BaseEntity {
	
	//quan he (1-n) voi bang user
	@ManyToOne
	@JoinColumn(name = "user_id")
	private UserEntity users;

	@ManyToMany
	@JoinTable(name = "detail_order", joinColumns = @JoinColumn(name = "order_id"), inverseJoinColumns = @JoinColumn(name = "product_id"))
	private List<ProductEntity> products = new ArrayList<>();
	
	
	@Column(name = "customerName", length = 100)
	private String customername;
	
	@Column(name = "customerPhone", length = 15)
	private String customerPhone;
	
	@Column(name = "customerAddress")
	private String customerAddress;
	
	@Column(name = "orderStatus")
	private String orderStatus;
	
	@Column(name = "quantityProduct")
	private Long quantityProduct;
	
	@Column(name = "totalPrice")
	private Long totalPrice;
	

	public Long getQuantityProduct() {
		return quantityProduct;
	}

	public void setQuantityProduct(Long quantityProduct) {
		this.quantityProduct = quantityProduct;
	}

	public Long getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Long totalPrice) {
		this.totalPrice = totalPrice;
	}

	public UserEntity getUsers() {
		return users;
	}

	public void setUsers(UserEntity users) {
		this.users = users;
	}

	public List<ProductEntity> getProducts() {
		return products;
	}

	public void setProducts(List<ProductEntity> products) {
		this.products = products;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}	
}
