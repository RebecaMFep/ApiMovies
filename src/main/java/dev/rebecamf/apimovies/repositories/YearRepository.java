package dev.rebecamf.apimovies.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import dev.rebecamf.apimovies.models.Year;

public interface YearRepository extends JpaRepository <Year,Long> {

}



