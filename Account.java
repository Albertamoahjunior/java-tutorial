public class Account {
   private String name;
   private String address;
   private Double balance;

   public void setName(String n){
       name = n;
   }
   public String getName(){
       return name;
   }
   public void setAddress(String a){
       address = a;
   }
   public String getAddress(){
       return address;
   }
   public void setBalance(Double b){
       balance = b;
   }
   public Double getBalance(){
       return balance;
   }
public void display(){
    System.out.println(getName());
    System.out.println(getAddress());
    System.out.println(getBalance());
}
}
