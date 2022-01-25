package exceptiondemo;

public class ThrowExample {
    static void m1(){
        try{
            throw new NullPointerException("Null Pointer exception occure");
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        ThrowExample.m1();
    }
}

