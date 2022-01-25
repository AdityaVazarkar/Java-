package exceptiondemo;


import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int a[]=new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value in array");
        for(int i=0;i< a.length;i++){
            a[i]= sc.nextInt();
        }
        try{
            System.out.println(a[10]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }finally {
            sc.close();
        }
        System.out.println("Normal flow");
    }

}
/**
 * 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
 */