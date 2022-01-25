package exceptiondemo;

public class Exp100 {
    public static void main(String[] args) {
        int ans , no2;
        try{
            no2 = 0;
            ans = 26/no2;
            System.out.println("main - try last st.");
        }catch (ArithmeticException ae){
         //  System.out.println("MyError : Division by zero");
         //   System.out.println("Exception object:"+ae);
          //  System.out.println("Massage"+ae.getMessage());
            System.out.println("Stack Trace :");
            ae.printStackTrace();
        }
        System.out.println("main -  last st.");
    }
}
