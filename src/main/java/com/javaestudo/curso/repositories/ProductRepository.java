package com.javaestudo.curso.repositories;

import com.javaestudo.curso.entities.Category;
import com.javaestudo.curso.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
