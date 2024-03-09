package com.example.blog.application.repositories;

import com.example.blog.application.entities.Category;
import com.example.blog.application.entities.Post;
import com.example.blog.application.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepo extends JpaRepository<Post, Integer> {
    List<Post> findByUser(User user);
    List<Post> findByCategory(Category category);
}
