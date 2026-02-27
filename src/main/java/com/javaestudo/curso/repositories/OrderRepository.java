package com.javaestudo.curso.repositories;

import com.javaestudo.curso.entities.Order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {

}
