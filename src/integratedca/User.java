/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integratedca;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author danie
 */
public class User {
    
    int userID;
    String userEmail;
    String userPassword;
    
    private static int counter = 0;
    //String [] rentedMovies = null;
    

    public User(String userEmail, String userPassword) {
        this.userID=counter++;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
       // Random random = new Random();
        //userID = random.nextInt();
    }

    public String getUserEmail() {
        return userEmail;
    }

    @Override
    public String toString() {
        return "User{" + "userID=" + userID + ", userEmail=" + userEmail + ", userPassword=" + userPassword + '}';
    }
       
   
   
                  
}
