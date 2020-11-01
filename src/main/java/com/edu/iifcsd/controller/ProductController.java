package com.edu.iifcsd.controller;

import com.edu.iifcsd.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("Product/health")
    public ResponseEntity<String> health(){
        return new ResponseEntity("200", HttpStatus.OK);
    }
}
