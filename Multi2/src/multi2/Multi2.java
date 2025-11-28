/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multi2;

import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class Multi2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
       


        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean validInput = false;

        // Loop until valid input is received
        while (!validInput) {
            System.out.println("Please enter an integer number:");

            // Check if the next input is an integer
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                validInput = true; // Input is valid, exit the loop
            } else {
                // Input is not an integer, display an error
                System.out.println("Error: Invalid input. Please enter only a whole number.");
                // Consume the invalid input to avoid an infinite loop
                scanner.next(); 
            }
        }

        // Once a valid number is entered
        int result = number * 2;
        System.out.println("The number you entered is: " + number);
        System.out.println("The number multiplied by 2 is: " + result);

        scanner.close(); // Close the scanner
    


        // TODO code application logic here
    }
    
}
