package com.example.btbotuc1.repository;

import com.example.btbotuc1.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class ProductRepository {
    List<Product> listProduct = new ArrayList<>();

    public ProductRepository(){
        Product product1 = new Product(1,"ao" , "ao so mi" , "12");
        Product product2 = new Product(2,"vay" , "vay dai" , "13");
        Product product3 = new Product(3,"ao" , "ao dai" , "14");

        listProduct.add(product1);
        listProduct.add(product2);
        listProduct.add(product3);
    }

    public List<Product> getAllProduct(){
        return listProduct;
    }

    public void createProduct(Product product){
        listProduct.add(product);
    }

    public void deleteProduct(int id){
        listProduct.remove(id);
    }

    public Product findById(int id){
        return listProduct.get(id);
    }

    public void update(int id , Product product){
        Product product1 = findById(id);
        listProduct.remove(product1);
        createProduct(product);
    }


}
