package com.rak.orderitem.exception;

@SuppressWarnings("serial")
public class OrderNotFoundException extends Exception {
	
	public OrderNotFoundException(String message) {
		super(message);
	}
}
