package com.vinod.springboot.liquibase.repository;

import com.vinod.springboot.liquibase.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
