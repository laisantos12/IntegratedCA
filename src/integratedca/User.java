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
    String username;
    String userPassword;
    String [] rentedMovies = null;
    
    public String[] returnRentedMoviesList(){
        return rentedMovies;
    }

    public User(String username, String userPassword) {
        this.username = username;
        this.userPassword = userPassword;
    }

    public int getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }
    
    
//    public int checkLogIn(String userEmail,String userPassword){
//        if(userEmail.equals(this.userEmail)&&userPassword==this.userPassword)
//            return 1;
//        else{
//        return -1;}
//    }
            
}
