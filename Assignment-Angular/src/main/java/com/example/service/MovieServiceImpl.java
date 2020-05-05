package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Movie;
import com.example.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository repository;
 
    @Override
    public Movie AddMovie(Movie movie) {
        return repository.save(movie);
    }
    @Override
    public Movie ViewById(int id) {
        return repository.findOne(id);
    }
    
}