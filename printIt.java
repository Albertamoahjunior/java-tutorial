import java.util.Scanner;
public class printIt {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Hey please type your word : ");

        String reply = keyboard.next();
        
        System.out.println(reply);
    }
}
