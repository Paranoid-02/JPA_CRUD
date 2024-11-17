package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    // Create
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    // Read
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Integer id) {
        return productRepository.findById(id).orElse(null);
    }

    // Update
    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    // Delete
    public void deleteProduct(Integer id) {
        productRepository.deleteById(id);
    }

    // Custom query
    public List<Product> getTop2ProductsByPriceRange() {
        return productRepository.findTop2ProductsByPriceRange();
    }

}
