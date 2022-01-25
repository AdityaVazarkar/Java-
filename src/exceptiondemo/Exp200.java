package exceptiondemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Exp200 {
    public static void main(String[] args) //throws IOException
     {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name;
        try {
            System.out.println("Enter ur name");
            name = br.readLine();
            System.out.println("Hello" + name);
        }catch (IOException ioe){
            System.out.println("exception is:"+ioe);
        }
    }
}
