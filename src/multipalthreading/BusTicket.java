package multipalthreading;

public class BusTicket {
    static int TotalTicket=15;
    static synchronized void bookTicket(int seats){
        System.out.println("Total ticket are:-"+TotalTicket);
        if(TotalTicket>=seats){
            System.out.println(seats+" Ticket are going to book:-");
            TotalTicket=TotalTicket-seats;
            System.out.println("Ticket left:-"+TotalTicket);
        }
        else {
            System.out.println("No ticket available");
        }
    }

    public void start() {
    }
}

class Row1 extends Thread{
    int seats;
    BusTicket busTicket;

    Row1(int seats,BusTicket busTicket){
        this.busTicket = busTicket;
        this.seats= seats;
    }

    @Override
    public void run() {
        busTicket.bookTicket(seats);
    }
}

class Row2 extends Thread {
    int seats;
    BusTicket busTicket;

    Row2(int seats, BusTicket busTicket) {
        this.busTicket = busTicket;
        this.seats = seats;
    }

    @Override
    public void run() {
        busTicket.bookTicket(seats);
    }
}

class BusTicketImp{
    public static void main(String[] args) {
        BusTicket b1 = new BusTicket();
        BusTicket b2 = new BusTicket();

        Row1 R1 = new Row1(5,b1);
        R1.start();

        Row1 R2 = new Row1(4,b2);
        R2.start();

        Row2 R3 = new Row2(3,b1);
        R3.start();

        Row2 R4 = new Row2(2, b2);
        R4.start();
    }
}

