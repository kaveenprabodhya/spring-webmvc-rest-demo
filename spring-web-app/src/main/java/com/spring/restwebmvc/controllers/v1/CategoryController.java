package com.spring.restwebmvc.controllers.v1;

import com.spring.restwebmvc.api.v1.model.CategoryDTO;
import com.spring.restwebmvc.api.v1.model.CategoryListDTO;
import com.spring.restwebmvc.services.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
@RestController
@RequestMapping(CategoryController.BASE_URL)
public class CategoryController {
    private final CategoryService categoryService;
    public static final String BASE_URL = "/api/v1/categories";

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

//    @GetMapping
//    public ResponseEntity<CategoryListDTO> getAllCategories(){
//        return new ResponseEntity<CategoryListDTO>(
//                new CategoryListDTO(categoryService.getAllCategories()),
//                HttpStatus.OK
//        );
//    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public CategoryListDTO getAllCategories(){
        return new CategoryListDTO(categoryService.getAllCategories());
    }

//    @GetMapping("/{name}")
//    public ResponseEntity<CategoryDTO> getCategoryName(@PathVariable String name){
//        return new ResponseEntity<CategoryDTO>(categoryService.getCategoryByName(name), HttpStatus.OK);
//    }

    @GetMapping("/{name}")
    @ResponseStatus(HttpStatus.OK)
    public CategoryDTO getCategoryName(@PathVariable String name){
        return categoryService.getCategoryByName(name);
    }
}
