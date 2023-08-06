import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class wow {
    public static void main(String args[]) throws IOException{
     File employeeType = new File("EmployeeInfo.txt");
     Scanner diskScanner = new Scanner(employeeType);

     for (int empNum = 0; empNum <=1; empNum++){
         payOneEmployee(diskScanner);
     }
     diskScanner.close();
     
    }
    public static void payOneEmployee(Scanner aScanner){
         WowWorker anEmployee = new WowWorker();
         anEmployee.setName(aScanner.nextLine());
         anEmployee.setTitle(aScanner.nextLine());
         anEmployee.setSalary(aScanner.nextDouble());
         aScanner.nextLine();
    }
}
