import java.util.Scanner;

public class myWork {
     public static void main(String args[]){
         int weightOfBaby;
         System.out.println("Enter the weight of one of the dectuplets : ");
         
         Scanner keyboard = new Scanner(System.in);

         weightOfBaby = keyboard.nextInt();

         weightOfBaby *= 10;

         int isFit = 1400;

         if (isFit >= weightOfBaby){
             System.out.println("You can fit all 10 babies. ");
         }
         else{
             System.out.println("You can't all 10 babies. "10);
         }

     }
}