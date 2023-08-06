public class DoPayrollNew {
    public static void main(String args[]){
        FullTimeEmployee manager = new FullTimeEmployee();

        manager.setEmployeeName("Albert Amoah Junior");
        manager.setJobTitle("Manager");
        manager.setWeeklySalary(50000.00);
        manager.setbenefitDeduction(50.00);
        manager.cutCheck(manager.findPaymentAmount());
        System.out.println();
    }
}
