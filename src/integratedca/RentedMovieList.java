/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integratedca;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author danie
 */
public class RentedMovieList {

    private final List<Movie> rentedMovies = new ArrayList<>();

    public List<Movie> getRentedMovies() {
        return rentedMovies;
    }

    public int numberOfMoviesRented() {
        return rentedMovies.size();
    }
    
    public double totalCostofRentals(RentedMovieList rentedMovieList, int numberOfMoviesRented){
        double total= 0;
        for(int i=0;i<numberOfMoviesRented;i++){
            
            total += Double.parseDouble(rentedMovies.get(i).getPrice());
        }
        return total;
    }

    public void addMovieToRentedList(Movie movie) throws IOException {

     
        rentedMovies.add(movie);

      
    }

 

}
