//*****************************************************************
//  Main.java (Dice Project)       Created by: Jaden Mathew
//
//  This program allows a player to roll a dice. There is a separate
//  dice class, and the dice can be rolled of sides 4, 6, 8, 10, 12, 
//  and 20 sides. 
//*****************************************************************
import java.util.Scanner;

// Initiate Main class
class Main 
{
  public static void main(String[] args) 
  {

    // Initialize variable sides for eventual use for holding user input value
    int sides = 0;
  // Create a scanner object to prepare for user input
  Scanner scan = new Scanner(System.in);
    
   // Ask question to user
    System.out.println("Hello! How many sides would you like on your dice? (Choose from 4, 6, 8, 10, 12, or 20)");
    
    // User inputs specified amounts of sides desired
    sides = scan.nextInt();
    
    // Building redundancies around the user input by prompting the user for input again if the initial input was not within the specified side list.
    while ((sides != 4) && (sides != 6) && (sides != 8) && (sides != 10) && (sides != 12) && (sides != 20))
    {
      System.out.println("The following input entered is invalid. Please try again with the following numbers of 4, 6, 8, 10, 12, or 20.");
      
      // Accept correct user input and stores it in sides
      sides = scan.nextInt();
    }
    
    // After correct user input, program creates a Dice object (found in Dice.java) using the integer sides
    Dice userRoll = new Dice(sides);
    
   // Uses the roll method and creates a value
    userRoll.roll();

    
   // Program outputs value of roll and ends
    System.out.println("Rolling...");
    System.out.println(userRoll);
    System.out.println("Thanks for rolling by!");
        
  }
}