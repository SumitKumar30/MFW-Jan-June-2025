package org.ncu.movie_app.repositories;

import java.util.ArrayList;
import java.util.List;

import org.ncu.movie_app.entities.Movie;
import org.springframework.stereotype.Repository;

@Repository
public class MovieRepository {
	List<Movie> movies = new ArrayList<Movie>();
	
	public MovieRepository() {
		movies.add(new Movie(101, "The Batman", "story of caped crusader", 9, 100.00));
		movies.add(new Movie(102, "Superman", "story of caped crusader", 8, 100.00));
		movies.add(new Movie(103, "Spiderman", "story of caped crusader", 7, 100.00));
		movies.add(new Movie(104, "Ironman", "story of caped crusader", 5, 100.00));
		movies.add(new Movie(105, "Thor", "story of caped crusader", 6, 100.00));
		movies.add(new Movie(106, "Loki", "story of caped crusader", 10, 100.00));
		movies.add(new Movie(107, "Avengers", "story of caped crusader", 6, 100.00));
	}
	
	public List<Movie> getAllMovies() {
		return movies;
	}
	
	public void addMovie(Movie movie) {
		// write your code here
		movies.add(movie);
	}
	
	public int deleteMovieById(int id) {
		return 0;
	}
	
	public Movie updateMoviebyId(int id, Movie m) {
		return null;
	}
}
