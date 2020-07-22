package com.rak.orderitem.service;

import java.util.List;

import com.rak.orderitem.exception.OrderNotFoundException;
import com.rak.orderitem.helper.OrderItemTo;

public interface OrderItemService {
	public String createOrderItem(List<OrderItemTo> orderItemTo) throws OrderNotFoundException;
	public List<OrderItemTo> retrieveOrderItem(Long orderItemId) throws OrderNotFoundException;
}
