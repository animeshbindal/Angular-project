package com.example.entity;
import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;


	@Entity
	@Table(name = "Movie")
	public class Movie {
		@NotEmpty(message="Movie name should not be empty")
		@Pattern(regexp = "([A-Za-z]+)|([A-Za-z])|([0-9])",message = "Only Alphanumeric allowed")
	    @Column (name="Movie_Name")
	    private String movieName;
		
		@Min(value=1,message="Rating must be between 1 and 5")
		@Max(value=5,message = "Rating must be between 1 and 5")
	    @Column(name="Give_Rating")
	    private int giveRating;
	    @Column(name="Genre")
	    private String genre;
		public String getMovieName() {
			return movieName;
		}
		public void setMovieName(String movieName) {
			this.movieName = movieName;
		}
		public int getGiveRating() {
			return giveRating;
		}
		public void setGiveRating(int giveRating) {
			this.giveRating = giveRating;
		}
		public String getGenre() {
			return genre;
		}
		public void setGenre(String genre) {
			this.genre = genre;
		}
		
		@Override
		public String toString() {
			return "Movie [movieName=" + movieName + ", giveRating=" + giveRating
					+ ", genre=" +genre + "]";
		}
	    
}
