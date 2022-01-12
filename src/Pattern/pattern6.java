package Pattern;

//import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("enter the number of row");
        //int row = scanner.nextInt();
        for (int i=0;i<4;i++){
            for(int j=4;j>=i;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=4;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
       // scanner.close();


    }
}
