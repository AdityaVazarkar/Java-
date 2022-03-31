package multipalthreading;

/*public class busTicket extends Thread {
    public static boolean totalAmount;
    int totalAmount = 0;
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            totalAmount = totalAmount + 1000;
        }
        this.notify();
    }
}
class busTicketThread {
    public static void main(String[] args) throws InterruptedException {
        BusTicket bt = new BusTicket();
        bt.start();
        synchronized (bt) {
            busTicket.wait();
            System.out.println(busTicket.totalAmount);
        }
    }
}

 */