package com.javaestudo.curso.repositories;

import com.javaestudo.curso.entities.Category;
import com.javaestudo.curso.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {

}
