package com.example.orderservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.orderservice.model.Order;
import com.example.orderservice.service.OrderService;

@RestController

@RequestMapping("/orders")

public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	 @PostMapping("/save")
	    public Order createUser(@RequestBody Order order) {
	        return orderService.createUser(order);
	    }

		
		@GetMapping("/{id}")
		public Order getOrderDetails(@PathVariable Long id) {
		  return orderService.getOrderDetails(id);
		}
		
		@GetMapping("/all")
		public List<Order> getAllOrders(){
			List<Order> orders=orderService.getAllOrders();
			return orders;
		}
}
