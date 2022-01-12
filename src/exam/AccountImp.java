package exam;

import java.util.Scanner;

public class AccountImp {
    public static void main(String[] args){
        int ch;
        Account account = new Account();
        account.addAccount();
        do {
            System.out.println("1:-Withdraw Money");
            System.out.println("2:-Deposit Money");
            System.out.println("3:-Display");
            System.out.println("4:-Exit");
            System.out.println("Enter your choice");
            Scanner sc1 = new Scanner(System.in);
            ch = sc1.nextInt();
            switch (ch){
                case 1:
                    account.withdrawMoney();
                    break;
                case 2:
                    account.depositMoney();
                    break;
                case 3:
                    account.displayData();
                    break;
                case 4:
                    System.out.println("exit");
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }
        } while (ch < 4);
    }

    }
