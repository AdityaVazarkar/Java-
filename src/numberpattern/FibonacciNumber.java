package numberpattern;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println("Enter the Number");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt(),a = 0,b=1,c;
        for(int i=0;i<no;i++){
            c=a+b;
            System.out.println("display "+c);
            a=b;
            b=c;

        }
    }
}
