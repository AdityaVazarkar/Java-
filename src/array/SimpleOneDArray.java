package array;

public class SimpleOneDArray {
    public static void main(String[] args) {
        int arr[];//declare
        arr = new int[5];//instantation

        arr[0]=1;
        arr[1]=2;
        // arr[2]=3;// value is 0
        arr[3]=4;
        arr[4]=5;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        // System.out.println(arr[5]);//out of bound for length 5at array


        // String

        String []names= new String[2];
        String empName[] ={"A","B"};

        names[0]="Aditya";
        names[1]="Cricket";

        System.out.println(names);
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(empName[0]);
        System.out.println(empName[1]);

    }
}
