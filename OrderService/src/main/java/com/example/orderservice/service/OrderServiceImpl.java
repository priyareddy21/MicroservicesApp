package com.example.orderservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.orderservice.model.Order;
import com.example.orderservice.repo.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	OrderRepository orderRepo;
	
	public Order createUser(Order order) {
		// TODO Auto-generated method stub
		return orderRepo.save(order);
	}
	
	public Order getOrderDetails(Long id) {
		// TODO Auto-generated method stub
    	return orderRepo.findById(id)
				.orElseThrow(()->new RuntimeException("Invalid Order id"));

	}

	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		return orderRepo.findAll();
	}
	

}
