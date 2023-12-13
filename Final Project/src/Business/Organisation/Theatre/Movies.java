/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organisation.Theatre;

import java.util.ArrayList;

/**
 *
 * @author anirudh
 */
public class Movies {
    
    ArrayList<Movie> movieList = new ArrayList<>();

    public ArrayList<Movie> getMovieList() {
        return movieList;
    }

    public void setMovieList(ArrayList<Movie> movieList) {
        this.movieList = movieList;
    }

    public ArrayList<Movie> getMoviesForTheatre(int id) {
        
        ArrayList<Movie> movies = new ArrayList<>();
        for(Movie movie: movieList)
        {
            if(movie.getTheatreId() == id)
                movies.add(movie);
        }
        return movies;
    }

    public Movie findMovieByName(String movieName) {
        for(Movie movie: movieList)
        {
            if(movie.getName().equals(movieName))
                return movie;
        }
        return null;
    }
    
    
            
    
}
