// Chapter 4 Page 262
// Programming Challenges #1

import java.util.Scanner;

public class Chapter4Problem1
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      int userNumber = -1;
      int sum = 0;
      
      
      
      while(userNumber < 1)
      {
         System.out.print("Please enter a positive nonzero integer");
         userNumber = keyboard.nextInt();
      }
      
      for(int number = 1; number <= userNumber; number++)
      {
         sum = sum + number;
      }
      
      System.out.println("The sum of numbers from 1 to " + userNumber + " is: " + sum);
   }
}