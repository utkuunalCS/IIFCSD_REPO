package com.edu.iifcsd.controller;

import com.edu.iifcsd.model.Product;
import com.edu.iifcsd.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("product/health")
    public ResponseEntity<String> health(){
        return new ResponseEntity("200", HttpStatus.OK);
    }

    @PostMapping("user/addProduct")
    public ResponseEntity<Product> addUser(@RequestBody Product product){

        return new ResponseEntity<>(productService.insert(product), HttpStatus.OK);
    }

    @GetMapping("product/getAllProducts")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
}
