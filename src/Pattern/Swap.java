package Pattern;

import java.util.Scanner;

public class Swap
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value of i");
        int i = scanner.nextInt();

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of j");
        int j = sc.nextInt();
        int temp;

        if (i != j)
        {

            temp = i;
            i = j;
            j = temp;
            System.out.println("Display the swap number i:" + i);
            System.out.println("Display the swap number j:" + j);
        }
    }
}
