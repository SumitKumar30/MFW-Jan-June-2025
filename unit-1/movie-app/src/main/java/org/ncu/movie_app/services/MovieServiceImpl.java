package org.ncu.movie_app.services;

import java.util.Comparator;
import java.util.List;

import org.ncu.movie_app.entities.Movie;
import org.ncu.movie_app.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {
	
	@Autowired
	private MovieRepository movieRepository;
	
	@Override
	public List<Movie> getSortedMovies() {
		List<Movie> movies = movieRepository.getAllMovies();
		// write the sort logic - sort the movies by id
		movies.sort(Comparator.comparing(Movie::getMovieId));
		return movies;
	}

	@Override
	public void addMovie(Movie movie) {
		movieRepository.addMovie(movie);
	}

	@Override
	public int removeMovieByID(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Movie updateMovieByID(int id, Movie movie) {
		// TODO Auto-generated method stub
		return null;
	}

}
