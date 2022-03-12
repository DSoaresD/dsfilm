package com.devsuperior.dsfilm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsfilm.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
