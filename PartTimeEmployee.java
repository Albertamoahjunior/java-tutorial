public class PartTimeEmployee extends Employee {
    private Double hourlyRate;

    public void setHourlyRate(Double hR){
        hourlyRate = hR;
    }
    public Double getHourlyRate(){
        return hourlyRate;
    }
    public double findPayment(int workHours){
        return workHours * hourlyRate;
    }
}
