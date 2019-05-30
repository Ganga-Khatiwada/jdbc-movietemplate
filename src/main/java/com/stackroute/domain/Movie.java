package com.stackroute.domain;

public class Movie {
    private int movieId;
    private String movieName;
    private int releaseYear;
    private int ratings;

    public Movie(int movieId,String movieName,int releaseYear,int ratings)
    {
        this.movieId=movieId;
        this.movieName=movieName;
        this.releaseYear=releaseYear;
        this.ratings=ratings;
    }

    public Movie() {
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", movieName='" + movieName + '\'' +
                ", releaseYear=" + releaseYear +
                ", ratings=" + ratings +
                '}';
    }
}
