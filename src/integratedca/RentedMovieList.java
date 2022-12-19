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
    
     private List<Movie> rentedMovies;
    
      public List<Movie> getRentedMovies() {
        return rentedMovies;
    }
  
  
    
  public void addMovieToRentedList(Movie movie) throws IOException{
     
        List<Movie> rentedMovies = new ArrayList<>();
        rentedMovies.add(movie);
        
        this.rentedMovies = rentedMovies;
        
  }
  
}
