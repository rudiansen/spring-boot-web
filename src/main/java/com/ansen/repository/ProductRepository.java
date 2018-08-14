package com.ansen.repository;

import org.springframework.data.repository.CrudRepository;

import com.ansen.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
