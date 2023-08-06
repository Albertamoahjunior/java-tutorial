import java.util.Scanner;

public class switchIt {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
         
        System.out.println("Enter verse number : ");
        int verse = keyboard.nextInt();

        switch(verse){
           case 1 :
           System.out.println("You reign forever");
           break;
           case 2 :
           System.out.println("Your is ever great");
           break;
           default :
           System.out.println("Sovreign One");
           break;
        }
        System.out.println("Eternal");

        keyboard.close();

        for(int count = 1; count <= 10; count++1){
              System.out.print("The number at the moment : ");
              System.out.println(count);
        }
    }
}
