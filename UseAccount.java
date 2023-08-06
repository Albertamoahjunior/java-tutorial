import java.util.Scanner;
public class UseAccount{
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        Account myAccount = new Account();
        Account yourAccount = new Account();

        String aName;
        String anAddress;
        Double aBalance;

        for (int i =1; i <= 3; i++){
           System.out.println("Enter Name :");
            aName = keyboard.next();
            System.out.println("Enter Address :");
            anAddress = keyboard.next();
            System.out.println("Enter Balance :");
            aBalance = keyboard.nextDouble();

            myAccount.setName(aName);
            myAccount.setAddress(anAddress);
            myAccount.setBalance(aBalance);
    }
       keyboard.close();

        myAccount.display();
    }
}