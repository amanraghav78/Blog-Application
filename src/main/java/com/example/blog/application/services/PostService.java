package com.example.blog.application.services;

import com.example.blog.application.entities.Post;
import com.example.blog.application.payloads.PostDto;
import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);

    Post updatePost(PostDto postDto, Integer postId);
    void deletePost(Integer postId);
    List<Post> getAllPost();
    Post getPostById(Integer postId);
    List<Post> getPostByCategory(Integer CategoryId);
    List<Post> getPostByUser(Integer userId);
    List<Post> searchPosts(String keyword);
}
