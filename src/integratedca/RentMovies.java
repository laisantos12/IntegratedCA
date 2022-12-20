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

    RentedMovieList rentedMovieList = new RentedMovieList();

    SuggestedMovies suggestions = new SuggestedMovies();

    InputValidation inputValidation = new InputValidation();

    public void rentMovie() throws IOException {

        String selected;
        int validatedInt = 0;

        do {

            movieList.createListFrom("src/moviesmetadataedited.csv");

            String secondMenu = ("\nWelcome to EirVid - From Your RTE Player."
                    + "\nPlease Select:"
                    + "\n1 - Rent a Movie"
                    + "\n2 - My Renteded Movies"
                    + "\n3 - Recomendations"
                    + "\n4 - Check out & Exit");

            System.out.println(secondMenu);

            selected = input.next();

            if (inputValidation.InputValidationInt(selected) == true) {
                validatedInt = Integer.parseInt(selected);

                switch (validatedInt) {
                    case 1: {

                        movieList.getMovies().forEach(System.out::println);
                        System.out.println("Select the ID of the movie you would like to rent");
                        rentedMovieList.addMovieToRentedList(movieList.getMovies().get(input.nextInt()));
                        break;
                    }
                    case 2: {
                        System.out.println(rentedMovieList.getRentedMovies());
                        break;
                    }
                    case 3: {

                        System.out.println("Here are some movie suggestions:\n");
                        suggestions.suggestedMovies(movieList.getMovies(), movieList.numberOfMovies());
                        System.out.println(suggestions.getSuggestions());
                        break;
                    }
                    case 4: {
                        System.out.println("Here are the movies you rented\n");
                        System.out.println(rentedMovieList.getRentedMovies());
                        System.out.println("\nThank you for chosen us.");
                        System.out.println(rentedMovieList.totalCostofRentals(rentedMovieList, rentedMovieList.numberOfMoviesRented()));
                    }

                    break;

                }}
                  else {
                    System.out.println("Error");

    }
                
            

        } while (validatedInt != 4); 
        
      

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
