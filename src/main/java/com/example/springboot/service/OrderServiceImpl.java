package com.example.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.model.order;
import com.example.springboot.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderRepository repository;
	
	
	@Override
	public String update(int sid) {
		Optional<order> object = repository.findById(sid);
		String msg = null;
		if (object.isPresent()) {
			order s = object.get();
			repository.delete(s);
			msg = "order Deleted Successfully";
		} else {
			msg = "order ID Not Found";
		}
		return msg;
	}


	@Override
	public String insert(order s) {
		repository.save(s);
		return "Student Added Successfully";
	}
	}