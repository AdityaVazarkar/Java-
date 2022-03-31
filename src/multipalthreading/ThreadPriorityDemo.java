package multipalthreading;

public class ThreadPriorityDemo {
    public static void main(String[] args) {

        ThreadPriority priority1 = new ThreadPriority();
        priority1.setPriority(Thread.MIN_PRIORITY);
        System.out.println(priority1.getPriority());

        ThreadPriority2 priority2 = new ThreadPriority2();
        priority2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(priority2.getPriority());


        priority1.start();
        priority2.start();
        System.out.println("Current"+Thread.currentThread().getPriority());

    }
}

class ThreadPriority extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Hi");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ThreadPriority2 extends Thread{
    public void run(){
        for(int i = 1 ; i <= 3 ; i++){
            System.out.println("Hello");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}