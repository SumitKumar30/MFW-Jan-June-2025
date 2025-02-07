package org.ncu.movie_app.entities;

public class Movie {
	private int movieId;
	private String movieName;
	private String movieDesc;
	private double movieRating;
	private double moviePrice;
	
	public Movie(int movieId, String movieName, String movieDesc, double movieRating, double moviePrice) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieDesc = movieDesc;
		this.movieRating = movieRating;
		this.moviePrice = moviePrice;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieDesc() {
		return movieDesc;
	}

	public void setMovieDesc(String movieDesc) {
		this.movieDesc = movieDesc;
	}

	public double getMovieRating() {
		return movieRating;
	}

	public void setMovieRating(double movieRating) {
		this.movieRating = movieRating;
	}

	public double getMoviePrice() {
		return moviePrice;
	}

	public void setMoviePrice(double moviePrice) {
		this.moviePrice = moviePrice;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", movieDesc=" + movieDesc + ", movieRating="
				+ movieRating + ", moviePrice=" + moviePrice + "]";
	}
	
}
