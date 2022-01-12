package exceptiondemo;

public class TryCatch1 {
    public static void main(String[] args) {
        try{
            int n = 10/0;

        }catch (ArithmeticException ae){
           // System.out.println("No cannot be divisible by 0");
           // ae.getStackTrace();
           // ae.getCause();
           // ae.getLocalizedMessage();
            System.out.println(ae.getStackTrace());
        }finally {
            System.out.println("in finally block");
        }
        System.out.println(3);
        System.out.println(4);
    }
}
