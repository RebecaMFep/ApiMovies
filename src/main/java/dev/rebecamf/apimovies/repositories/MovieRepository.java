package dev.rebecamf.apimovies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,Long> {
    
}
