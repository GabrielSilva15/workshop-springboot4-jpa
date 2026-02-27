package com.javaestudo.curso.services;

import com.javaestudo.curso.entities.Order;
import com.javaestudo.curso.entities.User;
import com.javaestudo.curso.repositories.OrderRepository;
import com.javaestudo.curso.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll(){
        return orderRepository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> Order = orderRepository.findById(id);
        return Order.get();
    }
}
