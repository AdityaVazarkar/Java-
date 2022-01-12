package controlstatement;

public class MAx
{
    public static void main(String[] args)
    {
        int x=15,y=15,z=15;
        if(x>=y && x>=z)
            System.out.println("X is Max");
        else if(y>=x && y>=z)
            System.out.println("Y is Max");
        else if(z>=x && z>=y)
            System.out.println("Z is MAx");
       // else
           // System.out.println("All are equal");
    }
}
