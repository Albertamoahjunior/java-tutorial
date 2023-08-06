public class WowWorker {
    private String name;
   private String title;
   private Double salary;

   public void setName(String n){
       name = n;
   }
   public String getName(){
       return name;
   }
   public void setTitle(String a){
       title = a;
   }
   public String getTitle(){
       return title;
   }
   public void setSalary(Double b){
       salary = b;
   }
   public Double getSalary(){
       return salary;
   }
public void display(){
    System.out.println(getName());
    System.out.println(getTitle());
    System.out.println(getSalary());
}
}
