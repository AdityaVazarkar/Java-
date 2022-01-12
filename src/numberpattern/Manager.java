package numberpattern;

import java.util.Scanner;

public class Manager extends Employee {
    private static int bonus;
    double calculateSalary;

    public Manager(int id, String name,String department,double salary, long bonus) {
        super(id,name,department,salary);
        this.bonus = (int) bonus;

    }



    public void Accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the Bonus");
        bonus=sc.nextInt();
    }
        public void Display() {
        System.out.println("Employee Bonus:"+bonus);
        System.out.println("Complete Salary:"+calculateSalary);
    }

    double CalculateSalary(){
        return super.getSalary() + bonus;
    }

    public static void main(String[] args) {
    Employee employee = new Employee(1,"A","j",5000);
    employee.Accept();
    employee.Display();
    Manager manager = new Manager(1,"aditya","java",5000,200);
    manager.Accept();
    manager.Display();


    }


}


