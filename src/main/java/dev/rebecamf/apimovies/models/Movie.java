package dev.rebecamf.apimovies.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;

@Entity
@Table (name="movies")

public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) @Column (name = "ide_movie")
    private Long id;
    private String title;
    private String discription;
    private Long running_time;


    public Movie() {
    }

    public Movie(String title, String discription, Long running_time) {
        this.id = id;
        this.title = title;
        this.discription = discription;
        this.running_time = running_time;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public Long getRunning_time() {
        return running_time;
    }

    public void setRunning_time(Long running_time) {
        this.running_time = running_time;
    }
    
}
