package com.edu.iifcsd.repository;

import com.edu.iifcsd.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component("productRepository")
public interface ProductRepository extends MongoRepository<Product, String>{
}
