package com.sbapp05.ProductInventorySystem.service;

import java.util.List;

import com.sbapp05.ProductInventorySystem.entity.Product;

public interface ProductService {

    Product addProduct(Product product);

    List<Product> getAllProducts();

    Product getProductById(Long id);

    Product updateProduct(Long id, Product product);

    void deleteProduct(Long id);

    List<Product> searchByName(String name);

    List<Product> getLowStockProducts();
}