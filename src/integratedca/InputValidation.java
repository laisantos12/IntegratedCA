/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integratedca;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class InputValidation {

    Scanner input = new Scanner(System.in);

    public boolean InputValidationInt(String input) {
        
        try {
            int myInt = Integer.parseInt(input);
            return true;

        } catch (Exception e) {
            System.out.println("Thats the wrong type of input");
            System.out.println("Try again");
            return false;
        }

    }



}
