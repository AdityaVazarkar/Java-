/*package exceptiondemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExample {
        static void writeFile() throws FileNotFoundException {
            FileInputStream fileInputStream = new FileInputStream("abc.txt");
        }

        static void writeFile1() throws FileNotFoundException{
            writeFile();
        }

        public static void main(String[] args) {
            try {
                ThrowsExample.writeFile1();
            }catch (FileNotFoundException e){
                e.printStackTrace();
            }
            System.out.println("");
        }
    }
}
*/