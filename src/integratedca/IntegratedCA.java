
package integratedca;

import java.io.IOException;

/**
 *
 * @author lsant
 */
public class IntegratedCA {

  public static void main(String[] args) throws IOException {

    MovieListCreator movieList = new MovieListCreator();

    movieList.createListFrom("src/moviesmetadataedited.csv");
    // how to return object
      System.out.println("Welcome to ÉirVid streaming ");
      
      
    
      //  movieList.getMovies().forEach(System.out::println);
        
        movieList.getMovies().get(0).activate();
        
        System.out.println(movieList.getMovies().get(0).isActive());
        
        MenuDisplay menu = new MenuDisplay();
        
        menu.displayMenu();
        System.out.println("test");
        
        
        System.out.println(movieList.getMovies().get(0).isActive());
        
        
        
  }
  
  
}
