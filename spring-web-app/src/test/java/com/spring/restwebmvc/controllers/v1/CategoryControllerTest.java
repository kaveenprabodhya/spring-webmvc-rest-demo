package com.spring.restwebmvc.controllers.v1;

import com.spring.restwebmvc.api.v1.model.CategoryDTO;
import com.spring.restwebmvc.services.CategoryService;
import com.spring.restwebmvc.services.ResourceNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class CategoryControllerTest {

    public static final String JOE = "Joe";
    @Mock
    CategoryService categoryService;

    @InjectMocks
    CategoryController categoryController;

    MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        mockMvc = MockMvcBuilders
                .standaloneSetup(categoryController)
                .setControllerAdvice(new RestResponseEntityExceptionHandler())
                .build();
    }

    @Test
    void getAllCategories() throws Exception {
        CategoryDTO category1 = new CategoryDTO();
        category1.setId(1L);
        category1.setName("Bob");

        CategoryDTO category2 = new CategoryDTO();
        category2.setId(2L);
        category2.setName("Joe");

        List<CategoryDTO> categories = Arrays.asList(category1, category2);

        when(categoryService.getAllCategories()).thenReturn(categories);

        mockMvc.perform(get("/api/v1/categories/")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.categories", hasSize(2)));
    }

    @Test
    void getCategoryName() throws Exception {
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setId(1L);
        categoryDTO.setName(JOE);

        when(categoryService.getCategoryByName(anyString())).thenReturn(categoryDTO);
        mockMvc.perform(get(CategoryController.BASE_URL+"/Joe")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", equalTo(JOE)));
    }

    @Test
    void testGetByNameNotFound() throws Exception {
        when(categoryService.getCategoryByName(anyString())).thenThrow(ResourceNotFoundException.class);

        mockMvc.perform(get(CategoryController.BASE_URL+"/Foo").contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isNotFound());
    }
}