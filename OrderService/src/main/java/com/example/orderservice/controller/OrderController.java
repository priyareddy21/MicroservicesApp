package com.example.orderservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/orders")

public class OrderController {
	
	@GetMapping("/save")
public String sampleOutput() {
  return "Priya123";
  
  
}
}