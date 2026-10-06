package com.myproject.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myproject.dscatalog.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
