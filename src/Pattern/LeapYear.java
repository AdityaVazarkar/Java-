package Pattern;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter year");
        Scanner scanner = new Scanner((System.in));
        int year = scanner.nextInt();

        if(((year%4==0) && (year%100!=0)) ||(year%400==0))
            System.out.println("The year is leap year");
        else
            System.out.println("The year is not leap year");


        }
}