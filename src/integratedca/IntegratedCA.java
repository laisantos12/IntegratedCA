

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
    public static void main(String[] args){
        //Reads the file
        
        
        
        
//        BufferedReader myReader = new BufferedReader(new FileReader("MovieMetadataEdited2.csv"));
//        String line = myReader.readLine();
         //Splits the file into columns
//        String[] lineArr;
//         //First line of the file
//        String[] movieClassifications;
//        //  List<> movieList = new ArrayList<>();
//        List<String[]> movieList = new ArrayList<>();
//        System.out.println("*----------Welcome to EirVid!----------*");
//        System.out.println(line);
//        int counter = 1;
//        
//        movieClassifications = line.split(",");
//           //Parses the file
//        //Keeps reading while has line
//        while ((line = myReader.readLine()) != null){
//            counter++;
//            if (counter == 1010) {
//                System.out.println(line);
//            }
//            lineArr = line.split(",");
//            movieList.add(lineArr);
//            //Prints the first element of the array
////            System.out.println(lineArr[0]);
//        }
//        
//        List<String[]> generalList;
//        try {
//            generalList = InputValidation.validateInput("moviesmetadataedited.csv");
//             for(String[] s: generalList) {
//            System.out.println(s[0]);
//            System.out.println(s[1]);
////            System.out.println(s[3]);
////            System.out.println(s[4]);
//                     
//
//        }
//
//        } catch (Exception e) {
//            System.out.println("error reading the file");
//        }
//        
        /*
        List<MOvie> list = new ArrayList()<>;
        
        try {
            generalList = InputValidation.validateInput("MovieMetadataEdited2.csv");
             for(String[] s: generalList) {
            list.add(new Movie(s[1],s[2],s[3]);
                     

        
        
        return list

        } catch (IOException ex) {
            Logger.getLogger(IntegratedCA.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
       //        for (int list = 0; list < generalList.size(); list ++){
//        //Loops the movies and gets the elements on the array
//        for (int movie = 0; movie < listClassification.length; movie ++){
////            System.out.println(movieClassifications[movie]);
//            //                System.out.println(movieList.get(list)[movie]);
//                try {
//                    String tst = generalList.get(list)[movie];
//                    System.out.println(generalList.get(list)[movie]);
//                } catch (ArrayIndexOutOfBoundsException e) {
////                    System.out.println( movieList.get(list));
//System.out.println(list + " ::: " + movie);
//                }
                
//                
//            }
//            
//        }

  System.out.println("test");
        String line;
     
        List<Movie> movies = new ArrayList<>();
        
       
        // create and return book of this metadata return new Book(name, price, author); }

        
        
        try{
        
            BufferedReader myReader = new BufferedReader(new FileReader("src/moviesmetadataedited.csv"));
            while((line = myReader.readLine())!= null){
            String[] values  = line.split (",");
                Movie movie = createMovie(values);
                movies.add(movie);
                System.out.println(movie);
           
                
            }
            
               
        }
        catch(IOException e){
            System.out.println("error reading the file");
        }
        
        System.out.println(movies);
       
    }
   
}

        
  //  }
//                System.out.println(movieList.get(list)[movie]);


    
 