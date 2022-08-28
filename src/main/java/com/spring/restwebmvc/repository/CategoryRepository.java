package com.spring.restwebmvc.repository;

import com.spring.restwebmvc.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
