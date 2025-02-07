package org.ncu.movie_app.services;

import java.util.List;

import org.ncu.movie_app.entities.Movie;

public interface MovieService {
	public List<Movie> getSortedMovies();
	public void addMovie(Movie movie);
	public int removeMovieByID(int id);
	public Movie updateMovieByID(int id, Movie movie);
}
