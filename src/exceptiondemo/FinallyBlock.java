/**
 *finally is  uses to closed canection
 */


package exceptiondemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FinallyBlock {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("abc.text");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }finally {
          //  fileInputStream.close();
        }
    }
}
