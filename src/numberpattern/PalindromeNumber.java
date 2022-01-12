package numberpattern;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number ");
        Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt(),sum = 0;
        int temp=no;
        while(no>0) {
            int re = no % 10;
            sum = (sum*10)+re;
            no = no / 10;
        }
        no = temp;
        if(temp==sum)
            System.out.println("The Number is Palindrome");
        else
            System.out.println("The Number is not NotPalindrome");

    }
}
