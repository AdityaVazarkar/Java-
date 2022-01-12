/**
 * try
 * catch
 * finally
 * throw
 * throwes
 */



package exceptiondemo;

public class TryCatch {
    public static void main(String[] args) {

        try {
           String name = null;
            System.out.println(name.length());
        }catch(NullPointerException ne){
        //    ne.printStackTrace();
          //  ne.getStackTrace();
            //ne.getMessage();

            System.out.println(ne);
        }

    }
}
