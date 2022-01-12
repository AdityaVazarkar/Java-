package controlstatement;

public class Division
{
    public static void main(String[] args)
    {
        int x  = 15;
        if(x%3==0 && x%5==0)
            System.out.println("Number is divisible by 3 & 5 both:");

        if (x%3==0)
            System.out.println("Number is divisible by of 3:");
        if (x%5==0)
            System.out.println("Number is divisible by of 5:");
        else
             System.out.println("Number is not divisible by 3 & 5 ");


    }
}