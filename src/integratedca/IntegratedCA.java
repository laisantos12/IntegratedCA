
package integratedca;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author lsant
 */
public class IntegratedCA {

  public static void main(String[] args) throws IOException {
      
    Login login = new Login();
    login.login();
      
    RentMovies rentMovies= new RentMovies();
    rentMovies.rentMovie();
    MovieListCreator movieList = new MovieListCreator();
    RentedMovieList rentedMovieList= new RentedMovieList();
   // SuggestedMovies suggestions = new SuggestedMovies();

    movieList.createListFrom("src/moviesmetadataedited.csv");
    // how to return object
    //System.out.println( movieList.getMovies());
    //movieList.getMovies().forEach(System.out::println);
    
//    suggestions.suggestedMovies(movieList.getMovies(), movieList.numberOfMovies());
    //suggestions.getSuggestions();
    //  System.out.println(suggestions.getSuggestions());
      //System.out.println(movieList.getMovies().get(1));
      //added a movie to the rentedMovieList
      
      
      //rentedMovieList.addMovieToRentedList(movieList.getMovies().get(2));

      //rentedMovieList.addMovieToRentedList(movieList.getMovies().get(1));

      //return the list of rented movies
      System.out.println(rentedMovieList.getRentedMovies());
      System.out.println(rentedMovieList.numberOfMoviesRented());
      //returns user
      System.out.println(login.getUsers());
      


     
       
      
   
    
  }
  
  
}
