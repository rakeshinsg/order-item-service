package com.rak.orderitem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rak.orderitem.exception.OrderNotFoundException;
import com.rak.orderitem.helper.OrderItemTo;
import com.rak.orderitem.service.OrderItemService;

@RestController
public class OrderItemServiceController {
	
	@Autowired
	private OrderItemService service;
	
	@PostMapping("/createOrderItem")
	public String createOrder(@RequestBody List<OrderItemTo> orderItemTos) throws OrderNotFoundException {
		return service.createOrderItem(orderItemTos);
	}
	
	@GetMapping("/getOrderItem/{orderId}")
	public List<OrderItemTo> createOrder(@PathVariable("orderId") long orderId) throws OrderNotFoundException{
		System.out.println("================"+orderId);
		return service.retrieveOrderItem(orderId);
	}
}
