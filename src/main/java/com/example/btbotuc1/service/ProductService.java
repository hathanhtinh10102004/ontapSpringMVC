package com.example.btbotuc1.service;


import com.example.btbotuc1.model.Product;
import com.example.btbotuc1.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public List<Product> getAllProduct(){
        return productRepository.getAllProduct();
    }

    public void createProduct(Product product){
        productRepository.createProduct(product);
    }

    public void deleteProduct(int id){
        productRepository.deleteProduct(id);
    }

    public void update(int id, Product product) {
        productRepository.update(id, product);
    }

    public Product findById(int id) {
        return productRepository.findById(id);
    }
}


