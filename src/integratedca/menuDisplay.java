/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integratedca;

import java.util.Scanner;

/**
 *
 * @author layhenececilio
 */
public class menuDisplay {
    
    private static void displayMenu() {
    Scanner input = new Scanner(System.in);
    
    
    do {
        System.out.println("\nPlease select the service from the below menu:      ");
        System.out.println("1 - Log in ");
        System.out.println("2 - Sign up");
        System.out.println("3 - Rent a movie");
        System.out.println("4 - My rented movies");
        System.out.println("5 - Recommendations");
        System.out.println("6 - Exit");
        getInput(input.next());
        


    } 
    while(true);// so pra tirar o erro
  } 

    private static void getInput(String next) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
