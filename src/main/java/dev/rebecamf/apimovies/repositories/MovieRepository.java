package dev.rebecamf.apimovies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import dev.rebecamf.apimovies.models.Movie;

public interface MovieRepository extends JpaRepository<Movie,Long> {
    
}
