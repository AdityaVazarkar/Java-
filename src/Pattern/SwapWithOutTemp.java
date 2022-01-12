package Pattern;

import java.util.Scanner;

public class SwapWithOutTemp {
    public static void main(String[] args) {
        System.out.println("Enter the value of x ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Enter the value of y");
        int y = sc.nextInt();

        x = x+y;
        y = x-y;
        x = x-y;

        System.out.println("After swapping value of x:"+x);
        System.out.println("After swapping value of y:"+y);
    }

}
