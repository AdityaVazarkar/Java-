package exceptiondemo;

import java.util.Scanner;

public class ImpSBI extends SBI{
    public static void main(String[] args) {

        double amount;
        Integer option;

        SBI sbi = new SBI();
        Scanner sc = new Scanner(System.in);

        sbi.accept();
        sbi.display();

        System.out.println("1:Withdraw");
        System.out.println("2:Deposit");
        System.out.println("3:exit");

        System.out.println("Enter the option");
        option= sc.nextInt();

        do{
            switch (option){
                case 1:
                    System.out.println("Enter the amount to be withdraw");
                    amount = sc.nextDouble();
                    sbi.withdraw(amount);
                    break;

                case 2:
                    System.out.println("Enter the amount to be deposit");
                    amount = sc.nextDouble();
                    sbi.deposit(amount);
                    break;

                case 3:
                    System.out.println("exit");
                    break;

                default:
                    System.out.println("You enter the wrong option");
                    break;
            }

        }while (option<3);
    }
}
