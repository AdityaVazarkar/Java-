package multipalthreading;

public class ThreadForLoop extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + ":-" + i);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
