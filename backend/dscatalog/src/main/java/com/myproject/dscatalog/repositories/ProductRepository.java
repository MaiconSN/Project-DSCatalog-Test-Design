package com.myproject.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myproject.dscatalog.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
