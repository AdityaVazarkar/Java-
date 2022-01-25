package exceptiondemo;

public class SBI  implements  Bank{

    double balance ;
    int accountNo;


    void accept() {
        accountNo = 586215;
        balance = 5000;
    }
    void display(){
        System.out.println("Account No :"+accountNo);
        System.out.println("Balance :"+balance);
    }



    @Override
    public double withdraw(double amount) {
        try{
            if(amount>balance){
                double insufficient=amount-balance;
                throw new InsufficientFundsException("Short of Rs"+insufficient);
            }
            else{
                balance = balance - amount;
                System.out.println("Successfully withdraw ");
                System.out.println("current balance is "+balance);
            }

        }catch(InsufficientFundsException e){
            System.out.println(e.getMessage());
            System.out.println("Insufficient balance");
        }
        return balance;
    }

    @Override
    public double deposit(double amount) {
        balance = balance + amount;
        System.out.println("Current balance is :"+balance);
        return balance;
    }





}


