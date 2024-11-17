package com.example.demo.repository;

import com.example.demo.model.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    @Query(value = "SELECT id, name, price FROM product WHERE price BETWEEN 15 AND 30 ORDER BY price ASC LIMIT 2", nativeQuery = true)
    List<Product> findTop2ProductsByPriceRange();
}


