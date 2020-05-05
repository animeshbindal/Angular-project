package com.example.repository;

import org.springframework.data.repository.Repository;

import com.example.entity.Movie;



public interface MovieRepository extends Repository {



    Movie findOne(int id);

    Movie save(Movie user);
}
