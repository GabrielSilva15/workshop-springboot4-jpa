package com.javaestudo.curso.services;

import com.javaestudo.curso.entities.Category;
import com.javaestudo.curso.entities.User;
import com.javaestudo.curso.repositories.CategoryRepository;
import com.javaestudo.curso.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> Category = categoryRepository.findById(id);
        return Category.get();
    }
}
