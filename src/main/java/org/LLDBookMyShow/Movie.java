package org.LLDBookMyShow;

public class Movie {
    int movieId;

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setMovieDurationInMin(int movieDurationInMin) {
        this.movieDurationInMin = movieDurationInMin;
    }

    public String getMovieName() {
        return movieName;
    }

    public int getMovieDurationInMin() {
        return movieDurationInMin;
    }

    String movieName;
    int movieDurationInMin;

}
