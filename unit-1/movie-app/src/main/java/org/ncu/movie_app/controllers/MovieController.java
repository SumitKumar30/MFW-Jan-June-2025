package org.ncu.movie_app.controllers;

import java.util.List;

import org.ncu.movie_app.entities.Movie;
import org.ncu.movie_app.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie_app")
public class MovieController {
	@Autowired
	private MovieService movieService;
	
	@GetMapping("/movies")
	public List<Movie> fetchMovies(){
		return movieService.getSortedMovies();
	}
	
	@GetMapping(value = "/")
	public String getMessage() {
		return "Hello Movie App";
	}
	
	@PostMapping(value = "/save_movie")
	public String saveMovie(@RequestBody Movie movie) {
		movieService.addMovie(movie);
		return "Movie saved successfully!!";
	}
}
