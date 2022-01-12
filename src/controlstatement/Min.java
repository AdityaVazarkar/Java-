package controlstatement;

public class Min
{
    public static void main(String[] args)
    {
        int x = 10, y = 15, z = 50;
        if (x <= y && x <= z)
            System.out.println("X is Min");
        else if (y <= x && y <= z)
            System.out.println("Y is Min");
        else if(z <= x && z <= y)
            System.out.println("Z is Min");
        else
            System.out.println("All are equal");
    }
}

