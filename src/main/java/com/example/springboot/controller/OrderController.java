package com.example.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.model.order;
import com.example.springboot.repository.OrderRepository;
import com.example.springboot.service.OrderService;

@RestController
@RequestMapping("order")
public class OrderController {
	 @Autowired
	    private OrderRepository orderRepository;

	    // Endpoint for updating customer data
	    @PutMapping("/")
	    public order updateCustomer(@PathVariable("id") int customer_id, @RequestBody order updatedOrder) {
	        return orderRepository.findById(customer_id)
	            .map(order -> {
	                order.setName(updatedOrder.getName());
	                order.setPhonenumber(updatedOrder.getPhonenumber());
	                order.setDOB(updatedOrder.getDOB());
	                order.setCustomerName(updatedOrder.getCustomerName());
	                return orderRepository.save(order);
	            })
	            .orElseGet(() -> {
	                updatedOrder.setCustomer_id(customer_id);
	                return orderRepository.save(updatedOrder);
	            });
	    }
}