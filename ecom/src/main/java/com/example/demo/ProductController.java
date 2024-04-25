package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//ProductController.java
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class ProductController {
 @Autowired
 private ProductRepository productRepository;
 
 @GetMapping("/getproducts")
 public List<Product> getAllProducts() {
     return productRepository.findAll();
 }
 @GetMapping("/countproducts")
 public Long countproducts() {
     return productRepository.count();
 }

}
