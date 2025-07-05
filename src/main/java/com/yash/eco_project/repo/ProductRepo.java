package com.yash.eco_project.repo;

import com.yash.eco_project.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;


@Repository
public interface ProductRepo extends JpaRepository<Product , Integer> {
}
