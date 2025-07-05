package com.yash.eco_project.service;


import com.yash.eco_project.model.Product;
import com.yash.eco_project.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repo ;

    public List<Product> getAllProducts() {
        return repo.findAll() ;
    }

    public Product getProductById(int id) {
        return repo.findById(id).get() ;
    }
}
