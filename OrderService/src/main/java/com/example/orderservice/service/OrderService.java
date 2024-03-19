package com.example.orderservice.service;

import java.util.List;

import com.example.orderservice.model.Order;

public interface OrderService {

	Order createUser(Order order);

	Order getOrderDetails(Long id);

	List<Order> getAllOrders();

}
