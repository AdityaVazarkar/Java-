package multipalthreading;

public class SecondThreadForLoop extends Thread {
    @Override
    public void run() {
        for(int j=1;j<=10;j++){
            try{
                Thread.sleep(5000);
                System.out.println(Thread.currentThread().getName()+":-"+j);
            }catch (InterruptedException ae){
                System.out.println(ae);
            }
        }
    }
}
