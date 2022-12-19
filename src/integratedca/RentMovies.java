package integratedca;

import java.util.Scanner;

/**
 *
 * @author lsant
 */
public class RentMovies {

    private int id;
    private int date;
    private int rentedMovieID;
    private String personRenting;
    private int backDate;

//    public RentMovies(int id, int date, int rentedMovieID, String personRenting, int backDate) {
//        this.id = id;
//        this.date = date;
//        this.rentedMovieID = rentedMovieID;
//        this.personRenting = personRenting;
//        this.backDate = backDate;
//    }
    Scanner input = new Scanner(System.in);
    
    MovieListCreator movieList = new MovieListCreator();
    
     public void RentMovie(){
        do{
        System.out.println("\nWelcome to EirVid - From Your RTE Player."
                + "\nPlease Select:"
                + "\n1 - Rent a Movie"
                + "\n2 - My Renteded Movies"
                + "\n3 - Recomendations"
                + "\n4 - Exit");
        
        switch(input.nextInt()){
            case 1 : movieList.getMovies().forEach(System.out::println);
            
        }
            
        
      }while(true);
     }
    private static final int RENTDURATION = 60000;

    private long activatedAt = Long.MAX_VALUE;

    public void activate() {
        activatedAt = System.currentTimeMillis();
    }

    public boolean isActive() {

        long activeFor = System.currentTimeMillis() - activatedAt;

        return activeFor >= 0 && activeFor <= RENTDURATION;
    }

    public int getId() {
        return id;
    }

    public int getDate() {
        return date;
    }

    public int getBorrowedMovieID() {
        return rentedMovieID;
    }

    public String getPersonRenting() {
        return personRenting;
    }

    public int getBackDate() {
        return backDate;
    }

    @Override
    public String toString() {
        System.out.println("*---Rent---*\n"
                + "Movie Id: " + id + "\n" + "Date of Rent: "
                + date + "\n" + "ID Movie Rented: " + rentedMovieID
                + "n" + "Client: " + personRenting + "n"
                + "Return Date: " + backDate + ".");
        return null;

    }
}
