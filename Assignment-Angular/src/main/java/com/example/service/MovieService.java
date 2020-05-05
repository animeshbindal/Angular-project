package com.example.service;

import com.example.entity.Movie;

public interface MovieService {
	Movie AddMovie(Movie movie);
	
	Movie ViewById(int id);
}
