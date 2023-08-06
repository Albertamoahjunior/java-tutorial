import java.util.Scanner;
import java.util.Random;
public class GuessingGame {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a number from 1 to 10 : ");

        int inputNumber = keyboard.nextInt();
        int randomNumber = new Random().nextInt(10) +1;

        if (inputNumber == randomNumber){
            System.out.println("*********");
            System.out.println("*You win*");
            System.out.println("**********");
        }
        else {
            System.out.println("You lose.");
            System.out.println("The random number was ");
            System.out.println(randomNumber + ".");
        }
        System.out.println("Thank you for playing.");
        
        keyboard.close();

    }
}
