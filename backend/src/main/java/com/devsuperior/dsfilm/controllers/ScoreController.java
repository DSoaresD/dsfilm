package com.devsuperior.dsfilm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsfilm.dto.MovieDTO;
import com.devsuperior.dsfilm.dto.ScoreDTO;
import com.devsuperior.dsfilm.servicies.ScoreService;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {
	
	@Autowired
	private ScoreService service;
	
	@PutMapping
	public MovieDTO saveScore(@RequestBody ScoreDTO dto){
		MovieDTO MovieDto = service.saveScore(dto);
		return MovieDto;
		
	}
	
}
