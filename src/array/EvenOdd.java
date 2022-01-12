package array;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int[] no = {1,2,3,4,5,6,7,8,9,10};
        int[] even = new int[no.length];
        int[] odd = new int[no.length];
        int j=0;
        int k=0;

        for(int i=0;i<no.length;i++){
            if(no[i]%2==0){
                even[j] = no[i];
                j++;
            }
            else{
                odd[k] = no[i];
                k++;
            }
        }
        System.out.println("Even no");
        for(int i=0;i<even.length;i++)
            System.out.println(even[i]+"\t");
        System.out.println("odd no");
        for (int i=0;i<odd.length;i++)
            System.out.println(odd[i]+"\t");



    }
}
