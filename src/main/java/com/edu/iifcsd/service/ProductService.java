package com.edu.iifcsd.service;

import com.edu.iifcsd.model.Product;
import com.edu.iifcsd.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductService {

    @Autowired
    @Qualifier("productRepository")
    private ProductRepository productRepository;

    public Product insert(Product product){
        return productRepository.insert(product);
    }

    public Optional<Product> getProduct(String productID){
        return productRepository.findById(productID);
    }

    public void removeProduct(String productID){
        productRepository.deleteById(productID);
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
}
