
package practicemethods;

/*
 * @author Vishal
 */

import javax.swing.*;
import java.text.*;
import java.util.*;

public class PracticeMethods 
{
    /*
     * Chapter 3 Programming Activity 2 - Using Predefined Classes
     */
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first name > ");
        String firstName = scanner.next();
        System.out.println("Hello " + firstName );
        System.out.println("Your name has " + firstName.length() + " letters");
        
        System.out.println();
        System.out.print("In what year were you born > ");
        int birthYear = scanner.nextInt();
        int age = 2016 - birthYear;
        System.out.println("This year, you will be " + age);
        final double lifeExpectancy = 78.7;
        DecimalFormat percentOfLife = new DecimalFormat("0.0%");
        System.out.println("You have lived " + percentOfLife.format(age/lifeExpectancy) + " of your life.");
        
        Random random = new Random();
        int randomNumber = (random.nextInt(20)) + 1;     
        int userGuess = Integer.parseInt(JOptionPane.showInputDialog(null, "I'm thinking of a number between 1 and 20. What is your guess?"));
        JOptionPane.showMessageDialog(null, "The number was " + randomNumber 
                + "\nYour guess was " + Math.abs(randomNumber-userGuess) + " away.");
    }
    
}
