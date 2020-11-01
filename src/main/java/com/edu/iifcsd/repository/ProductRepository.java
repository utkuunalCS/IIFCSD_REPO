package com.edu.iifcsd.repository;

import com.edu.iifcsd.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String>{
}
