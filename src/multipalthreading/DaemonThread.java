package multipalthreading;

public class DaemonThread extends Thread {
    @Override
    public void run() {
        System.out.println("Current Executing Thread"+Thread.currentThread());
        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon Thread");
        }else{
            System.out.println("User Thread");
        }
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
        DaemonThread daemonThread1 = new DaemonThread();
        try {
            daemonThread1.start();
            daemonThread1.setDaemon(true);
        }catch(IllegalThreadStateException e){
            System.out.println("IllegalThreadStateException occurs when");
        }
        System.out.println("After Exception");
        DaemonThread daemonThread2 = new DaemonThread();
        daemonThread2.setDaemon(false);
        daemonThread2.start();

    }
}
