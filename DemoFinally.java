public class DemoFinally {
    
    public static void main(String args[]){
        try{
            doSomething();
        }catch(Exception e){
            System.out.println("Exception caught in main");
        }
    }
    static void doSomething(){
        try{
            System.out.println(0/0);
        }catch(Exception e){
            System.out.println("Exception caught in doSomething." );
            System.out.println(0/0);
        }finally{
            System.out.println("I will get printed");
        }
        System.out.println("I won't get printed");
    }
}
