public class Employee {
    private String employeeName;
    private String jobTitle;
    private Double salary;

    public void setEmployeeName(String eN){
        employeeName = eN;
    }
    public String getEmployeeName(){
        return employeeName;
    }
    public void setJobTitle(String jT){
        jobTitle = jT;
    }
    public String getJobTitle(){
        return jobTitle;
    }
    public void setSalary(Double eS){
        salary = eS;
    }
    public Double getSalary(){
        return salary;
    }
    public void cutCheck(Double amountPaid){
        System.out.printf("Your order of payment to %s of ",employeeName);
        System.out.printf("%,.2f\n",amountPaid);
        System.out.printf("Cheque cleared!");
    }
}
