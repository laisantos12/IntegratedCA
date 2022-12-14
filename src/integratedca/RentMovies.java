
package integratedca;

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
    
//    @Override
//    public String toString() {
//        return "*---Rent---*" +  "Movie Id: " + id +  ", Date of Rent: " + date + ", ID Movie Rented: " + rentedMovieID + ", Client " + personRenting + ", Return Date: " + backDate + ".";
//    }
    
    @Override
    public String toString() { 
        System.out.println("*---Rent---*\n"
        +  "Movie Id: " + id +  "\n" + "Date of Rent: "
        + date + "\n" + "ID Movie Rented: " + rentedMovieID 
        +"n"+ "Client: " + personRenting + "n" +
        "Return Date: " + backDate + ".");
        return null;
      
    
    
     }
}
