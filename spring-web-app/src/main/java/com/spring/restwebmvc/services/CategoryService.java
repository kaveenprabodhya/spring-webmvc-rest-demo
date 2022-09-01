package com.spring.restwebmvc.services;

import com.spring.restwebmvc.api.v1.model.CategoryDTO;

import java.util.List;

public interface CategoryService {
    List<CategoryDTO> getAllCategories();

    CategoryDTO getCategoryByName(String name);
}
