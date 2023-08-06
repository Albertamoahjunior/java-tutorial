public class Acknowledgement {
  public static void main(String args[]){
      System.out.println("Please excuse me while I take a nap.....");

      
      takeANap();

      System.out.println("Wow that was refreshing");

  }  
  static void takeANap(){
      try{
          Thread.sleep(5000);
      }catch(InterruptedException e){
          System.out.println("Hey who who woke me up?");
      }
  }
}
