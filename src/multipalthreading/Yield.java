package multipalthreading;

 class Yield extends Thread {
     @Override
     public void run() {
         for (int i = 0; i <= 5; i++) {
             Thread.yield();
             System.out.println("Hallo" + Thread.currentThread().getName());
         }
         System.out.println("Hi" + Thread.currentThread().getName());
     }


     public static void main(String[] args) {
         Yield yield = new Yield();
         yield.start();
         for (int i = 0; i <= 5; i++) {
             System.out.println("Hello" + Thread.currentThread().getName());
         }
         System.out.println("Hi"+Thread.currentThread().getName());
     }
 }
