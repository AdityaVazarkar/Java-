package Pattern;

public class Pattern8 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                if(i%2==0)
                    System.out.print(" *");
            }
            System.out.println();
        }
    }
}
