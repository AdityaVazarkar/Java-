package multipalthreading;

public class Interrupt extends Thread {


    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(10000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Interrupt interrupt = new Interrupt();
        interrupt.start();
        try {
            interrupt.interrupt();
        } catch (Exception e) {
            System.out.println(e);
            //e.printStackTrace();
        }
    }
}
