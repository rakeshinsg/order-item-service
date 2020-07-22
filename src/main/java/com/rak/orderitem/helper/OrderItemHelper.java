package com.rak.orderitem.helper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.rak.orderitem.domain.OrderItem;

@Component
public class OrderItemHelper {
	
	public OrderItem fromOrderItemTo(OrderItemTo orderTo) {
		return new OrderItem(orderTo.getProductCode(), orderTo.getProductName(), orderTo.getQuantity(), orderTo.getOrderId());
	}
	
	public List<OrderItemTo> fromOrderItem(List<OrderItem> orderItems) {
		List<OrderItemTo> orderItemTos = new ArrayList<>();
		orderItems.forEach(orderItem -> {
			orderItemTos.add(new OrderItemTo(orderItem.getProductCode(), orderItem.getProductName(),
					orderItem.getQuantity(), orderItem.getOrderId()));
		});
		return orderItemTos;
	}
}
