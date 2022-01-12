package controlstatement;

public class Calculate
{
    public static void main(String[] args)
    {
        int x = 5;
        int y = 10;
        int i;
        String s="Sub";
         switch (s){
             case "Add":
                 i=x+y;
                 System.out.println("Addition is:"+i);
                 break;
             case "Sub":
                 i=x-y;
                 System.out.println("Subtration is:"+i);
                 break;
             case "Mul":
                 i=x*y;
                 System.out.println("Multiplecation is:"+i);
                 break;
             case "Div":
                 i=y/x;
                 System.out.println("Division is:"+i);
                 break;
             case "Mod":
                 i=x%y;
                 System.out.println("Modulo is:"+i);
                 break;

        }


    }
}
