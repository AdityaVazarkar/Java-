package multipalthreading;

public class MoveTicketBook {
    double ticket=5;

   void MoveTicketBook(double byeticket){
        if(ticket >= byeticket){
            ticket = ticket - byeticket;
            System.out.println("After Bye Ticket"+ticket+"ticket left");
        }
         else{
            System.out.println("Insufficient Ticket"+ticket);
        }
    }
}
class ByeTicket extends Thread{
    static private final MoveTicketBook book = new MoveTicketBook();
    double byeticket;


    @Override
    public void run() {
      //  System.out.println(Thread.currentThread().getName());
        book.MoveTicketBook(byeticket);
    }

    public static void main(String[] args) throws InterruptedException {
       ByeTicket aditya = new ByeTicket();
        aditya.start();
        aditya.setName("Aditya");
        aditya.byeticket = 2;

       ByeTicket mahavir = new ByeTicket();
        mahavir.start();
        mahavir.setName("Mahavir");
        mahavir.byeticket = 1;

        ByeTicket vaibhav = new ByeTicket();
        vaibhav.start();
        vaibhav.setName("Vaibhav");
        vaibhav.byeticket = 4;
    }

}
