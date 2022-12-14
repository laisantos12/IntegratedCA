/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
  
  
    
  public void createListFrom(String filename) throws IOException{
        
        String line;
     
        List<Movie> movies = new ArrayList<>();
        
       
          try{
        
            BufferedReader myReader = new BufferedReader(new FileReader(filename));
            //skips first line
            myReader.readLine();
            int id=0;
            while((line = myReader.readLine())!= null){
            String[] values  = line.split (",");
                
                Movie movie = createMovie(id,values);
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
