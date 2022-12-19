
package integratedca;

import static integratedca.Movie.createMovie;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author danie
 */
public class MovieListCreator {
    
  private List<Movie> movies;

    public List<Movie> getMovies() {
        return movies;
    }
  
      public int numberOfMovies() {
        return movies.size();
    }
  
    
  public void createListFrom(String filename) throws IOException{
        
        String line;
     
        List<Movie> movies = new ArrayList<>();
        
       
          try{
        
            BufferedReader myReader = new BufferedReader(new FileReader(filename));
            //skips first line
            myReader.readLine();

            int id = 0;
            while((line = myReader.readLine())!= null){
            String[] values  = line.split (",");
                
            Movie movie = createMovie(id, values);
            id++;
            movies.add(movie);
                
            }
            
               
        }
        catch(IOException e){
            System.out.println("error reading the file");
        }
                this.movies = movies;

    }
}
