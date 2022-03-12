package com.devsuperior.dsfilm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsfilm.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);

}
