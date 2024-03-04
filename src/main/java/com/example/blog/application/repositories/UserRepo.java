package com.example.blog.application.repositories;

import com.example.blog.application.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {

}
