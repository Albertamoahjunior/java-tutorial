public class FullTimeEmployee extends Employee {
    private Double weeklySalary;
    private Double benefitDeduction;

    public void setWeeklySalary(Double wS){
        weeklySalary = wS;
    }
    public Double getWeeklySalary(){
        return weeklySalary;
    }
    public void setbenefitDeduction(Double bD){
        benefitDeduction = bD;
    }
    public Double getbenefitDeduction(){
        return benefitDeduction;
    }
    public Double findPaymentAmount(){
        return weeklySalary - benefitDeduction;
    }
}
