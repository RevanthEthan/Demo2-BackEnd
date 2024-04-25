package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//ProductRepository.java
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
}