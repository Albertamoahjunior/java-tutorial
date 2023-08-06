import java.util.Scanner;

public class Main {
   
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        String words[] = new String[5];

        int i = 0;

        do{
            words[i] = keyboard.next();
        }while(!words[i++].equals("Quit"));
         
        for (int j = 0; j<5; j++){
            System.out.println(words[j].length());
        }


        keyboard.close();
    }
}
