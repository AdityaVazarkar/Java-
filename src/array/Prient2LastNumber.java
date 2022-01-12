package array;

public class Prient2LastNumber {
    public static void main(String[] args) {
        int temp, size;
        int array[] = {10,40,50,60,90 };
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
        System.out.println("second largest element is "+array[size-2]);
    }

}
