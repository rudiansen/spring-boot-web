package com.ansen.service;

import java.util.Optional;

import com.ansen.model.Product;

public interface ProductService {

	Iterable<Product> listAllProducts();
	
	Optional<Product> getProductById(Integer id);
	
	Product saveProduct(Product product);
	
	void deleteProduct(Integer id);
}
