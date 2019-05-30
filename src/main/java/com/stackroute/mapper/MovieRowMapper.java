package com.stackroute.mapper;

import com.stackroute.domain.Movie;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MovieRowMapper implements RowMapper<Movie> {

    @Override
    public Movie mapRow(final ResultSet resultSet, final int rowNum) throws SQLException {
        final Movie movie = new Movie();
        movie.setMovieId(resultSet.getInt("movieId"));
        movie.setMovieName(resultSet.getString("movieName"));
        movie.setReleaseYear(resultSet.getInt("releaseYear"));
        movie.setRatings(resultSet.getInt("ratings"));
        return movie;
    }

}
