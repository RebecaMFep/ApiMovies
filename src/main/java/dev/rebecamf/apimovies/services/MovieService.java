package dev.rebecamf.apimovies.services;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.rebecamf.apimovies.models.Movie;
import dev.rebecamf.apimovies.repositories.MovieRepository;

@Service

public class MovieService {
    MovieRepository repository;

    public MovieService(MovieRepository repository) {
        this.repository = repository;
    }  

    public List <Movie> getAll() {
        List <Movie> movies = repository.findAll();
        return movies;
    }
    
}
