package com.example.demo.repository;

import com.example.demo.model.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer>{
    @Query("SELECT p FROM Product p WHERE p.price BETWEEN 15 AND 30 ORDER BY p.price LIMIT 2")
    List<Product> findTop2ProductsByPriceRange();
}
