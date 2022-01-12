package Pattern;

import java.util.Scanner;

public class patter5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of row");
        int row = scanner.nextInt();
        for (int i = 0; i < row; i++) {
            for(int j=row-1;j>1;j--){
                System.out.println("");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("\t");
        }
        for (int k = row - 1; k >= 0; k--) {
            for (int j = 0; j <= k-1; j++) {
                System.out.print("*"+"");
            }
            System.out.println("");
        }
        scanner.close();

    }
}
