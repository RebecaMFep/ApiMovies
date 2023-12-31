package dev.rebecamf.apimovies.controllers.controllers;

import java.util.List;
import org.factoriaf5.firstapp.models.Country;
import org.factoriaf5.firstapp.services.CountryService;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "${api-endpoint}/countries")
public class MovieController {

    MovieService service;

    public MovieController(MovieService service) {
        this.service = service;
    }

    @GetMapping(path = "")
    public List<Movie> index() {

        List<Movie> movies = service.getAll();
        return movies;

    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Movie> show(@PathVariable("id") Long id) throws Exception {

        Movie movie = service.getById(id);

        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(movie);
    }

    @PostMapping(path = "")
    public ResponseEntity<Movie> create(@RequestBody Movie movie) {

        Movie newMovie = service.save(movie);

        return ResponseEntity.status(201).body(newMovie);
    }



}