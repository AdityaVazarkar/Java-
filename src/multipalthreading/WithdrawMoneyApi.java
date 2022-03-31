package multipalthreading;

public class WithdrawMoneyApi {
    double amount = 1000;

    synchronized void WithdrawMoneyApi(double withdraw) {
        if (amount >= withdraw) {
            amount = amount - withdraw;
            System.out.println("Amount After Withdraw" + amount);
        } else {
            System.out.println("Insufficient Balance" + amount + "in Account");
        }
    }
}

class BankApi extends Thread {
    static private final WithdrawMoneyApi withdrawMoneyApi = new WithdrawMoneyApi();
    double withdraw;

    @Override
    public void run() {
        //  System.out.println(Thread.currentThread().getName());
        withdrawMoneyApi.WithdrawMoneyApi(withdraw);
    }

    public static void main(String[] args) throws InterruptedException {
        BankApi aditya = new BankApi();
        aditya.start();
        aditya.setName("Aditya");
        aditya.withdraw = 500;

        BankApi mahavir = new BankApi();
        mahavir.start();
        mahavir.setName("mahavir");
        mahavir.withdraw = 500;

        BankApi vaibhav = new BankApi();
        vaibhav.start();
        vaibhav.setName("vaibhav");
        vaibhav.withdraw = 100;
    }
}