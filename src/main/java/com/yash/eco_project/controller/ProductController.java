package com.yash.eco_project.controller;


import com.yash.eco_project.model.Product;
import com.yash.eco_project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")

public class ProductController {

    @Autowired
    private ProductService service ;

    @RequestMapping("/")
    public String greet(){
        return "Hey yash how are you " ;
    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return service.getAllProducts() ;
    }

    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable int id ){
        return service.getProductById(id) ;
    }

}
