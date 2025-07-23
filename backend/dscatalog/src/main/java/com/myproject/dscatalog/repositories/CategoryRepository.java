package com.myproject.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myproject.dscatalog.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
