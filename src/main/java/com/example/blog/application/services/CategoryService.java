package com.example.blog.application.services;

import com.example.blog.application.payloads.CategoryDto;

import java.util.List;

public interface CategoryService {
    CategoryDto createCategory(CategoryDto categoryDto);
    CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);
    void deleteCategory(Integer categoryId);
    CategoryDto getCategoryDto(Integer categoryId);
    List<CategoryDto> getCategories();
}
