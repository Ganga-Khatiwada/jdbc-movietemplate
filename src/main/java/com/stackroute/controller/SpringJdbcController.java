package com.stackroute.controller;

import com.stackroute.domain.Movie;
import com.stackroute.repository.SpringJdbcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SpringJdbcController {
    @Autowired
    private SpringJdbcRepository springJdbcRepository;

    public ResponseEntity<String> executeShow() {
        Movie movie = springJdbcRepository.get("1");
        return new ResponseEntity("MovieId: " + movie.getMovieId()
                + " MovieName: " + movie.getMovieName()+" ReleaseYear: "+movie.getReleaseYear()+" Ratings: "+movie.getRatings(), HttpStatus.OK);
    }

    public ResponseEntity<String> insert() {
        Movie movie = new Movie(3, "Taal",1998,4);
        springJdbcRepository.add(movie);
        return new ResponseEntity("Movie Added: MovieId: " + movie.getMovieId()
                + " MovieName: " + movie.getMovieName()+" ReleaseYear: "+movie.getReleaseYear()+" Ratings: "+movie.getRatings(), HttpStatus.OK);
    }

    public ResponseEntity<String> read() {
        Movie movie = springJdbcRepository.get("2");
        return new ResponseEntity("Movie Get: MovieId: " + movie.getMovieId()
                + " MovieName: " + movie.getMovieName()+" ReleaseYear: "+movie.getReleaseYear()+" Ratings: "+movie.getRatings(), HttpStatus.OK);
    }

    public ResponseEntity<String> update() {
        Movie movie = new Movie(2,"Dosti",2002,4);
        springJdbcRepository.update(movie);
        return new ResponseEntity("Movie Update: MovieId: " + movie.getMovieId()
                + " MovieName: " + movie.getMovieName()+" ReleaseYear: "+movie.getReleaseYear()+" Ratings: "+movie.getRatings(), HttpStatus.OK);
    }

    public ResponseEntity<String> delete() {
        Movie movie = new Movie(1,"YJHD",2013,5);
        springJdbcRepository.delete(movie);
        return new ResponseEntity("Movie Delete: MovieId: " + movie.getMovieId()
                + " MovieName: " + movie.getMovieName()+" ReleaseYear: "+movie.getReleaseYear()+" Ratings: "+movie.getRatings(), HttpStatus.OK);
    }
    public ResponseEntity<?> getAll() {
        List<Movie> movieList =springJdbcRepository.getAll();
        return new ResponseEntity<List<Movie>>(movieList,HttpStatus.OK);
    }

}
