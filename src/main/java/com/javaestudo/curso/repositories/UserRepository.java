package com.javaestudo.curso.repositories;

import com.javaestudo.curso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
