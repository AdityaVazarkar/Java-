package Pattern;

import java.util.Scanner;

public class MaxNumInArray {
    public static void main(String[] args) {


        int temp, size;
       int array[] = {10,60,10,40,90 };
        size = array.length;

       for(int i=0;i<size;i++){
           for(int j=i+1;j<size;j++){

               if(array[i]>array[j])
               {
                   temp=array[i-1];
                   array[i]=array[j];
                   array[j]=temp;

               }
           }
       }
        System.out.println("largest number in array is : "+array[size-1]);
    }
}

