package com.example.orderservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController 
public class FallbackController {
	
	@GetMapping("/orderFallback")
	public String orderServiceFallBack(){
		return "Order service is down. Try again after some time";
		
	}

	
	@GetMapping("/userFallback")
	public Mono<String> userServiceFallBack(){
		return Mono.just("User service is down. Try again after some time");
		
	}

}
