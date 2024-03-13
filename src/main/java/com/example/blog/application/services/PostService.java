package com.example.blog.application.services;

import com.example.blog.application.entities.Post;
import com.example.blog.application.payloads.PostDto;
import com.example.blog.application.payloads.PostResponse;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);

    PostDto updatePost(PostDto postDto, Integer postId);
    void deletePost(Integer postId);
    PostResponse getAllPost(Integer pageNumber, Integer pageSize);
    PostDto getPostById(Integer postId);
    List<PostDto> getPostByCategory(Integer CategoryId);
    List<PostDto> getPostByUser(Integer userId);
    List<Post> searchPosts(String keyword);
}
