package com.spring.restwebmvc.api.v1.mapper;

import com.spring.restwebmvc.api.v1.model.CategoryDTO;
import com.spring.restwebmvc.domain.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    CategoryDTO categoryToCategoryDTO(Category category);
}
