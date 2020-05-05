package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.entity.Movie;
import com.example.service.MovieService;



@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/movies"})
public class MovieController {

	@Autowired
    private MovieService userService;
	
	@PostMapping
    public Movie create(@RequestBody Movie movie){
        return userService.AddMovie(movie);
    }

    @GetMapping(path = {"/{id}"})
    public Movie findOne(@PathVariable("id") int id){
        return userService.ViewById(id);
    
	
}
}
