package com.spring.restwebmvc.repository;

import com.spring.restwebmvc.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
