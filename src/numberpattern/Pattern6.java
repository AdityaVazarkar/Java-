package numberpattern;

public class Pattern6 {
    public static void main(String[] args) {
        int cnt=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(cnt%2==0)
                System.out.print(cnt+"\t");
                cnt++;
            }
            System.out.println();
        }
    }
}
