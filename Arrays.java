public class Arrays {
  private static int guests[] = new int[10];
   private static int numberInRoom = 1;
   
public static void main(String args[]){
   for(int i = 0; i<10; i++){
       System.out.println("Room Number\t People in the room");
       guests[i] = numberInRoom;
       System.out.println(i + " \t          " + guests[i]);
       numberInRoom += 2;
   }
}}
