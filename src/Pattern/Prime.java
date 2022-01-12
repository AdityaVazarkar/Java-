package Pattern;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int count=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int no= scanner.nextInt();
        for(int i=2;i<no;i++) {

            if (no % i == 0) {
                 count++;
                break;
            }
        }
        if(count==0)
            System.out.println("Number is prime");
        else
            System.out.println("number is not prime");
    }
}
