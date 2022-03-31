package multipalthreading;

class Th extends Thread {

    @Override
    public void run(){
    for(int i=1;i<11;i++) {
        System.out.println(i+Thread.currentThread().getName());
    }
    for(int j=1;j<11;j++){
        System.out.println(j+Thread.currentThread().getName());
    }
   // super.run();
    }


    public static void main(String[] args) {
   Th th = new Th();
    th.start();
   // th.run();
    }
}
