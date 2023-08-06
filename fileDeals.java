import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class fileDeals {
    public static void main(String args[]) throws IOException {
        Scanner keyboard = new Scanner(new File("GuessingGame.txt"));
       
        for (int empNum = 1; empNum <= 3; empNum++ ){
            payOneEmployee(keyboard);
        }
        keyboard.close();
}
    static void payOneEmployee(Scanner aScanner){
        Account anEmployee = new Account();
    }
    }
    
