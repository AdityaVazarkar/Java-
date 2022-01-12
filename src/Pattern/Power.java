package Pattern;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the exponent");
        int exponent = scanner.nextInt();

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the base");
        int base = sc.nextInt();

        int result = 1;

        while(exponent > 0){
            result = base * result;
            --exponent;
        }
        System.out.println("Answer=" + result);

    }
}
