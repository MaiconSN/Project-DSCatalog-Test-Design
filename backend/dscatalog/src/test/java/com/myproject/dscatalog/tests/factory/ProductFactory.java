package com.myproject.dscatalog.tests.factory;

import java.time.Instant;

import com.myproject.dscatalog.dto.ProductDTO;
import com.myproject.dscatalog.entities.Category;
import com.myproject.dscatalog.entities.Product;

public class ProductFactory {
	
	public static Product createdProduct() {
		
		Product product = new Product(1L, "Product Test", "Product Test", 100.0, "http://teste.com/img.png", Instant.parse("2026-09-07T10:41:00Z"));
		product.getCategories().add(new Category(2L, "Eletrônicos"));
		
		return product;
	}
	
	public static ProductDTO createdProductDTO() {
		
		Product product = createdProduct();
		return new ProductDTO(product, product.getCategories());
	}

}
