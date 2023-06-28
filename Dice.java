//*****************************************************************
//  Dice.java (Dice Project)       Created by: Jaden Mathew
//
//  The dice class contains a constructor, an overloaded
//  constructor, getters and setters, a roll and toString method.
//*****************************************************************
public class Dice 
{
  
  // This variable stores the number of sides on the dice
  private int sides;
  
  // This variable stores the rolled value
  private int userRoll;
  
  // the Default constructor
  public Dice() {
  }
  
  // the Overloaded constructor
  public Dice(int overSides)
  {
    sides = overSides;
  }

   // Getter for the sides
  public int getSides()
  {
    return sides;
  }

  // Getter for userRoll
  public int getuserRoll()
  {
    return userRoll;
  }
  
  // Setter for the sides
  public void setSides(int newSides) 
  {
    // Sets sides to newSides
    this.sides = newSides;
  }

  // Setter for userRoll
  public void setDie(int newuserRoll) 
  {
    this.userRoll = newuserRoll;
  }
  
  // Public method roll produces a value for a roll
  public int roll()
  {
    //userRoll gives a random number from 1-20
    userRoll = (int)(Math.random()*sides) + 1;
    
    // Returns value back
    return userRoll;
  }

   // Print the value of the roll
  public String toString()
  {
    return "The dice landed on: " + userRoll + "!";  
  }  
}