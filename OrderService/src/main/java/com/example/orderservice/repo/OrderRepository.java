package com.example.orderservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.orderservice.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
