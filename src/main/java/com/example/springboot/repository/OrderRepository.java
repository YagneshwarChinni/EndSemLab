package com.example.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springboot.model.order;

@Repository
public interface OrderRepository extends CrudRepository<order, Integer>
{

}
