//Aditya Rahul  Vazarkar
//Roll NO:-143
package collageassignment;
import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
            int A[][] = {{1, 2, 3}, {3, 3, 4}, {3, 4, 4}};
            int B[][] = {{6, 7, 8}, {7, 8, 9}, {8, 9, 1}};

            System.out.println("print the Array A");
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < A[i].length; j++) {
                    System.out.print(A[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();

            System.out.println("Print Array B:");
            for (int i = 0; i < B.length; i++) {
                for (int j = 0; j < B.length; j++) {
                    System.out.print(B[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();

            int expression;

            do {
                System.out.println("1:-Addition");
                System.out.println("2:-Multiplication");
                System.out.println("3:-Transpose");
                System.out.println("4:-Exit");

                System.out.println("Enter the Operator");
                Scanner sc = new Scanner(System.in);
                expression = sc.nextInt();

                switch (expression) {
                    case 1: {
                        int C[][] = new int[3][3];
                        for (int i = 0; i < C.length; i++) {
                            for (int j = 0; j < C.length; j++) {
                                C[


                                        i][j] = A[i][j] + B[i][j];
                                System.out.format(C[i][j] + " ");
                            }
                            System.out.println();
                        }
                        System.out.println();
                    }
                    break;

                    case 2: {
                        int D[][] = new int[3][3];
                        for (int i = 0; i < D.length; i++) {
                            for (int j = 0; j < D[i].length; j++) {
                                D[i][j] = 0;
                                for (int k = 0; k < 3; k++) {
                                    D[i][k] = D[i][j] + A[i][k] * B[k][j];
                                }
                                System.out.print(D[i][j] + "  ");
                            }
                            System.out.println();
                        }
                        System.out.println();
                    }
                    break;

                    case 3: {
                        int transpose[][] = new int[3][3];
                        for (int i = 0; i < A.length; i++) {
                            for (int j = 0; j < A.length; j++) {
//				transpose[j][i]=A[i][j];
                                System.out.print(A[j][i] + "  ");
                            }
                            System.out.println();
                        }
                    }
                    break;

                    case 4: {
                        System.exit(0);
                    }
                    System.out.println("Exit");
                }
            }while (expression <= 4);

        }
}
