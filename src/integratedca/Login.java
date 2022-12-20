/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integratedca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author layhenececilio
 */
public class Login {

    Scanner input = new Scanner(System.in);
    String option;
    boolean loginVerified=false;
    int optionValidated;
    String email, password;
    List<User> systemUsers = new ArrayList<>();
    
    InputValidation inputValidation = new InputValidation();
    
   
    
    public List<User> getUsers() {
        return systemUsers;
    }

    public void login() {
        do {
            String firstMenu = ("\nWelcome to EirVid - From Your RTE Player."
                    + "\nPlease Select:"
                    + "\n1 - Login"
                    + "\n2 - Create an account");
            
            System.out.println(firstMenu);
            
            option = input.next();
            
            
            if(inputValidation.InputValidationInt(option) == true){
                optionValidated = Integer.parseInt(option);
            switch (optionValidated) {
                case 1:
                    System.out.println("Please enter your email: ");
                    email = input.next();
                    System.out.println("Please enter your password: ");
                    password = input.next();
                    User user = new User(email, password);
                    if (checkEmail(user.getUserEmail())) {
                        System.out.println("You are logged sucessfully!!"
                                + "\n");
                        loginVerified=true;
                        System.out.println(systemUsers);
                    } else {
                        System.out.println("Verify your credentials or create a new account!");
                    }
                    break;
                case 2:
                    System.out.println("Please enter your email: ");
                    email = input.next();
                    System.out.println("Please enter your password: ");
                    password = input.next();
                    User newUser = new User(email, password);
                    if (checkEmail(newUser.getUserEmail())) {
                        System.out.println("User is already in our system. Go to Login option");
                    } else {
                        systemUsers.add(newUser);
                        System.out.println("You have created your account successfully!!");
                        
                    
                    }
                    break;
                default:
                    System.out.println("Please pick one valid option");
                    break;
            }}
            else{}
        } while (loginVerified==false );
    }

    public boolean checkEmail(String email) {
        boolean checked = false;
        for (int i = 0; i < systemUsers.size(); i++) {
            if (email.equals(systemUsers.get(i).getUserEmail())) {
                System.out.println("Emails is already in our system!!!!!");
                checked = true;
            } else {
                checked = false;
                System.out.println("User created !!!");
            }
        }
        return checked;
    }
}
