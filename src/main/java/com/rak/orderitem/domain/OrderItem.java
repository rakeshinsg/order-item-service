package com.rak.orderitem.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="ORDER_ITEM")
public class OrderItem {
	@Id
	@GeneratedValue
	private long oiid;
	
	@Column(name="product_code")
	private String productCode;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="quantity")
	private int quantity;
	
	@Column(name="oid")
	private long orderId;
	
		
	public OrderItem(){}
	public OrderItem(String productCode, String productName, int quantity, long orderId) {
		super();
		this.productCode = productCode;
		this.productName = productName;
		this.quantity = quantity;
		this.orderId = orderId;
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public long getOiid() {
		return oiid;
	}
	public void setOiid(long oiid) {
		this.oiid = oiid;
	}
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}	
}
