package com.rak.orderitem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rak.orderitem.exception.OrderNotFoundException;
import com.rak.orderitem.helper.OrderItemHelper;
import com.rak.orderitem.helper.OrderItemTo;
import com.rak.orderitem.repository.OrderItemRepository;

@Service
public class OrderItemServiceImpl implements OrderItemService {
	
	private final OrderItemRepository  orderRepository;
	private final OrderItemHelper  orderHelper;
	
	OrderItemServiceImpl(OrderItemRepository  orderRepository, OrderItemHelper  orderHelper) {
		this.orderRepository = orderRepository;
		this.orderHelper = orderHelper;
	}

	@Override
	public String createOrderItem(List<OrderItemTo> orderItemTos) throws OrderNotFoundException {
		orderItemTos.forEach(orderItemTo -> {
			orderRepository.save(orderHelper.fromOrderItemTo(orderItemTo));
		});
		return "Order Item Created!";
	}

	@Override
	public List<OrderItemTo> retrieveOrderItem(Long orderId) {
		return orderHelper.fromOrderItem(orderRepository.getOrderByOrderId(orderId));
	}
}
