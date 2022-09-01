package com.spring.restwebmvc.repository;

import com.spring.restwebmvc.domain.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepository extends JpaRepository<Vendor, Long> {
}
