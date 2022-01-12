package numberpattern;

import java.util.Scanner;

public class Employee {
    private static int id;
    private static String name;
    private  static String department;
    private static double salary;




    public Employee(int id, String name,String department,double salary){
        this.id=id;
        this.name=name;
        this.department=department;
        this.salary=salary;
    }



    public void Accept(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Id:\n Name: \n Department: \n Salary: ");
        id=sc.nextInt();
        name=sc.next();
        department=sc.next();
        salary=sc.nextInt();
    }

    public void Display(){
        System.out.println("Employee Id:"+id);
        System.out.println("Employee Name:"+name);
        System.out.println("Employee Department:"+department);
        System.out.println("Employee Salary:"+salary);
    }

    public static double getSalary() {
        return salary;
    }
}
