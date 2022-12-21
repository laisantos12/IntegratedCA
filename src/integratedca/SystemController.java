
package integratedca;

import java.io.IOException;

/**
 *
 * @author lsant
 */
public class SystemController {
    public void controlSystem() throws IOException{
        Login login = new Login();
        login.login();
        
        MovieListCreator movieList = new MovieListCreator();
        RentedMovieList rentedMovieList= new RentedMovieList();
        SuggestedMovies suggestions = new SuggestedMovies();
        
        movieList.createListFrom("src/moviesmetadataedited.csv");

        RentMovies rentMovies= new RentMovies();
        rentMovies.rentMovie();
        
        System.out.println(rentedMovieList.getRentedMovies());
        
        suggestions.suggestedMovies(movieList.getMovies(), movieList.numberOfMovies());
        
        
        suggestions.getSuggestions();
        
             //returns user
        System.out.println(login.getUsers());
    }
    
}
