package exam;

import java.util.Scanner;

public class Account {
    private String accountNo, accountType,  username, bankName;
    private double balance;
    public void addAccount() {
        System.out.println("AccountNo");
        accountNo="7893629";
        System.out.println("AccountType");
        accountType="saving";
        System.out.println("Balance");
        balance=500000;
        System.out.println("UserName");
        username="Aditya";
        System.out.println("BankName");
        bankName="SBI";
    }
    public void displayData(){
        System.out.println("Account NO is"+accountNo);
        System.out.println("Account Type is"+accountType);
        System.out.println("Balance is"+balance);
        System.out.println("Username is"+username);
        System.out.println("Bank Name is"+bankName);
    }
    public void withdrawMoney(){
        Scanner sc = new Scanner(System.in);
        int Money;
        System.out.println("Withdraw Money is");
        Money = sc.nextInt();
        balance = balance - Money;
        if(balance>=Money)
            System.out.println("Balance after withdraw:"+balance);
        else
            System.out.println("Insufficient Balance");
    }
    public void depositMoney(){
        Scanner scanner = new Scanner(System.in);
        int Money;
        System.out.println("Deposit Money");
        Money = scanner.nextInt();
        balance = balance + Money;
    }


}