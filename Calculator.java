/*
A programm to do simple calculations. Will search on how to the input
*/

import java.util.Scanner;
import java.io.IOException;
public class Calculator {
 
    public static void main(String args[])throws IOException{
      String computNumbers;
      System.out.println("Please type your figures to be calculated");
      Scanner numberInput = new Scanner(System.in);
      
      computNumbers = numberInput.next();

      int numbers = Integer.parseInt(computNumbers);

      calculate(numbers);

      numberInput.close();
    }
   public static void calculate(int number){
       int computedValue = number;

       System.out.println(computedValue);
   }
}
