
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
    //System.out.println( movieList.getMovies());
    //movieList.getMovies().forEach(System.out::println);
    
    Login login = new Login();
    login.login();
    
  }
  
  
}
