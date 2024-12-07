package com.example.springboot.service;

import java.util.List;

import com.example.springboot.model.order;

public interface OrderService
{
	public String insert(order s);
	public String update(int sid);
	
}
