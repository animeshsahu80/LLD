package org.LLDBookMyShow;

import org.LLDBookMyShow.Enums.City;
import org.LLDSnakeAndLadder.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MovieController {
    Map<City, List<Movie>>  citySpecificMovies;
    List<Movie> allMovies;

    public void addMovie(Movie movie, City city){
        allMovies.add(movie);
        List<Movie> moviesInCity= citySpecificMovies.getOrDefault(city,new ArrayList<>());
        moviesInCity.add(movie);
        citySpecificMovies.put(city,moviesInCity);
    }
    public Movie getMovieByName(String movieName){
        for(Movie movie:allMovies){
            if(movie.movieName.equals(movieName)){
                return movie;
            }

        }
        return null;
    }
    List<Movie> getMoviesByCity(City city) {
        return citySpecificMovies.get(city);
    }

    public void removeMovie(Movie movie, City city){
        allMovies.remove(movie);
        List<Movie> moviesInCity= citySpecificMovies.getOrDefault(city,new ArrayList<>());
        moviesInCity.remove(movie);
        citySpecificMovies.put(city,moviesInCity);
    }
}
