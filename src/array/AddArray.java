package array;

import java.util.Scanner;

public class AddArray {
    public static void main(String[] args) {
        int i,j;
        int a[][] = new int[2][2];
        Scanner scanner = new Scanner(System.in);
        int no;
        for ( i = 0; i < 2; i++) {
            for ( j = 0; j < 2; j++) {
                System.out.println("Enter value of first matrix");
                a[i][j] = scanner.nextInt();
            }
        }
        for ( i = 0; i < 2; i++) {
            for ( j = 0; j < 2; j++) {
                System.out.print(a[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
        int b[][] = new int[2][2];
        Scanner sc = new Scanner(System.in);
        int no2;
        for ( i = 0; i < 2; i++) {
            for ( j = 0; j < 2; j++) {
                System.out.println("Enter value of 2 matrix");
                b[i][j] = scanner.nextInt();
            }
        }
        for ( i = 0; i < 2; i++) {
            for ( j = 0; j < 2; j++) {
                System.out.print(b[i][j]);
                System.out.print("\t");
            }
            System.out.println();
            int c[][] = new int[2][2];
            Scanner scanner1 = new Scanner(System.in);
            c[i][j]=a[i][j] + b[i][j];
            System.out.println("addition of matrix is");
        }

    }
}