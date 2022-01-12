package numberpattern;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number ");
        Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt(),sum = 0;
        int temp=no;
        while(no>0) {
            int re = no % 10;
            sum = sum + re * re * re;
            no = no / 10;
        }
        no = temp;
        System.out.println("sum of cube of digits is:"+sum);
        if(temp==sum)
            System.out.println("The Number is Armstrong");
        else
            System.out.println("The Number is not Armstrong");

    }
}

