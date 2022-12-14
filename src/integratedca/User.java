/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integratedca;

/**
 *
 * @author danie
 */
public class User {
    
    int userID;
    String userEmail;
    String userPassword;
    String [] rentedMovies = null;
    
    public String[] returnRentedMoviesList(){
        return rentedMovies;
    }
    
    public int checkLogIn(String userEmail,String userPassword){
        if(userEmail.equals(this.userEmail)&&userPassword==this.userPassword)
            return 1;
        else{
        return -1;}
    }
            
}
