package integratedca;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lsant/daniel
 */
public class RentMovies {

//    private int id;
//    private int date;
//    private int rentedMovieID;
//    private String personRenting;
//    private int backDate;

//    public RentMovies(int id, int date, int rentedMovieID, String personRenting, int backDate) {
//        this.id = id;
//        this.date = date;
//        this.rentedMovieID = rentedMovieID;
//        this.personRenting = personRenting;
//        this.backDate = backDate;
//    }
    Scanner input = new Scanner(System.in);
    
    MovieListCreator movieList = new MovieListCreator();
    
    RentedMovieList rentedMovieList= new RentedMovieList();
    
    SuggestedMovies suggestions = new SuggestedMovies();
    
    
     public void rentMovie() throws IOException{
        boolean end;
        do{
             end=false;
            movieList.createListFrom("src/moviesmetadataedited.csv");
            System.out.println("\nWelcome to EirVid - From Your RTE Player."
                + "\nPlease Select:"
                + "\n1 - Rent a Movie"
                + "\n2 - My Renteded Movies"
                + "\n3 - Recomendations"
                + "\n4 - Exit");
        
        switch(input.nextInt()){
            case 1 : {
            
                System.out.println(movieList.getMovies());
                System.out.println("Select the ID of the movie you would like to rent");
                rentedMovieList.addMovieToRentedList(movieList.getMovies().get(input.nextInt()));
                break;
            }
            case 2: {System.out.println(rentedMovieList.getRentedMovies());
            break;
            }
            case 3:{
                
                System.out.println("Here are some movie suggestions");
                suggestions.suggestedMovies(movieList.getMovies(), movieList.numberOfMovies());
                System.out.println(suggestions.getSuggestions());
                break;
            }
            case 4:
                end=true;
                break;
            
            
        }
           
        
      }while(end==false);
     }
    private static final int RENTDURATION = 60000;

    private long activatedAt = Long.MAX_VALUE;

    public void activateRent() {
        activatedAt = System.currentTimeMillis();
    }

    public boolean isRentActive() {

        long activeFor = System.currentTimeMillis() - activatedAt;

        return activeFor >= 0 && activeFor <= RENTDURATION;
    }

//    public int getId() {
//        return id;
//    }
//
//    public int getDate() {
//        return date;
//    }
//
//    public int getBorrowedMovieID() {
//        return rentedMovieID;
//    }
//
//    public String getPersonRenting() {
//        return personRenting;
//    }
//
//    public int getBackDate() {
//        return backDate;
//    }
//
//    @Override
//    public String toString() {
//        System.out.println("*---Rent---*\n"
//                + "Movie Id: " + id + "\n" + "Date of Rent: "
//                + date + "\n" + "ID Movie Rented: " + rentedMovieID
//                + "n" + "Client: " + personRenting + "n"
//                + "Return Date: " + backDate + ".");
//        return null;
//
//    }
}
