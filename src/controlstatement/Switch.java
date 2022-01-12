package controlstatement;

public class Switch {
    public static void main(String[] args) {
       // int input = 5;//int short byte string
        String s = "4";
        switch (s){//int or short or byte or string
            case "1":
                System.out.println("today is Sunday");
                break;
            case "2":
                System.out.println("today is Monday");
                break;
            case "3":
                System.out.println("today is Tuesday");
                break;
            case "4":
                System.out.println("today is Wednesday");
                break;
            case "5":
                System.out.println("today is Thursday");
                break;
            case "6":
                System.out.println("today is Friday");
                break;
            default:
                System.out.println("today is Saturday");

        }

    }
}
