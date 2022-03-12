package com.devsuperior.dsfilm.servicies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsfilm.dto.MovieDTO;
import com.devsuperior.dsfilm.dto.ScoreDTO;
import com.devsuperior.dsfilm.entities.Movie;
import com.devsuperior.dsfilm.entities.Score;
import com.devsuperior.dsfilm.entities.User;
import com.devsuperior.dsfilm.repositories.MovieRepository;
import com.devsuperior.dsfilm.repositories.ScoreRepository;
import com.devsuperior.dsfilm.repositories.UserRepository;

@Service
public class ScoreService {

	@Autowired
	private MovieRepository movieRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ScoreRepository ScoreRepository;
	
	@Transactional
	public MovieDTO saveScore(ScoreDTO dto) {
		
		User user = userRepository.findByEmail(dto.getEmail());
		if(user == null) {
			 user = new User();
			 user.setEmail(dto.getEmail());
			 user = userRepository.saveAndFlush(user);
			
		}
		
		Movie movie = movieRepository.findById(dto.getMovieId()).get();
		
		Score score = new Score();
		score.setMovie(movie);
		score.setUser(user);
		score.setValue(dto.getScore());
		
		score = ScoreRepository.saveAndFlush(score);
		
		double sum = 0.0;
		for(Score s : movie.getScores()) {
			sum = sum + s.getValue();
		}
		
		double avg = sum / movie.getScores().size();
		
		movie.setScore(avg);
		movie.setCount(movie.getScores().size());
		
		movie = movieRepository.save(movie);
		
		return new MovieDTO(movie);
	}
}
