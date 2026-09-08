package com.myproject.dscatalog.respositories;

import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.myproject.dscatalog.entities.Product;
import com.myproject.dscatalog.repositories.ProductRepository;
import com.myproject.dscatalog.tests.factory.ProductFactory;

@DataJpaTest
public class ProductRepositoryTests {
	
	@Autowired
	private ProductRepository repository;
	
	private long exintingId;
	private long totalValueIdInDataBase;
	private Product product = ProductFactory.createdProduct();
	
	@BeforeEach
	void setUp() throws Exception {
		exintingId = 1L;
		totalValueIdInDataBase = 25L;
		product.setId(null);
	}
	
	@Test
	public void saveShouldPersistWithAutoincrementWhenIdIsNull() {
		product = repository.save(product);
		
		Assertions.assertNotNull(product.getId());
		Assertions.assertEquals(totalValueIdInDataBase + 1, product.getId());
	}
	
	@Test
	public void deleteShouldDeleteObjectWhenIdExists() {
		repository.deleteById(exintingId);
		
		Optional<Product> result = repository.findById(exintingId);
		Assertions.assertFalse(result.isPresent());
	}
	
	

}
