package multipalthreading;

public class ImpFor {
    public static void main(String[] args) {
        ThreadForLoop th1 = new ThreadForLoop();
        th1.start();
        th1.setName("TH1");

        SecondThreadForLoop th2 = new SecondThreadForLoop();
        th2.start();
        th2.setName("TH2");
    }
}
