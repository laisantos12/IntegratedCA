
package integratedca;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author lsant
 */
public class IntegratedCA {

  public static void main(String[] args) throws IOException {

    MovieListCreator movieList = new MovieListCreator();
    RentedMovieList rentedMovieList= new RentedMovieList();

    movieList.createListFrom("src/moviesmetadataedited.csv");
    // how to return object
    //System.out.println( movieList.getMovies());
    //movieList.getMovies().forEach(System.out::println);
    
   // Login login = new Login();
   // login.login();
      //System.out.println(movieList.getMovies().get(1));
      //added a movie to the rentedMovieList
      
      rentedMovieList.addMovieToRentedList(movieList.getMovies().get(2));

      rentedMovieList.addMovieToRentedList(movieList.getMovies().get(1));

      //return the list of rented movies
      System.out.println(rentedMovieList.getRentedMovies());
      System.out.println(rentedMovieList.numberOfMoviesRented());
     
       
      
   
    
  }
  
  
}
