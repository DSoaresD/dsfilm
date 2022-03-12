package com.devsuperior.dsfilm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsfilm.entities.Score;
import com.devsuperior.dsfilm.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
