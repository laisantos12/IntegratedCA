

package integratedca;

import static integratedca.Movie.createMovie;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lsant
 */
public class IntegratedCA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
   
    MovieListCreator movieList= new MovieListCreator();

    movieList.createListFrom("src/moviesmetadataedited.csv");
        System.out.println(movieList.getMovies().get(0));
    

}}

   
 