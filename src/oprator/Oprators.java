package oprator;

public class Oprators {
    public static void main(String[] args) {
        int a = 10, b = 15;
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a<=b);
        System.out.println(a>=b);
        System.out.println(a!=b);

        //unary
        System.out.println(a++);
        System.out.println(a--);
        System.out.println(++a);
        System.out.println(--a);
        System.out.println(~a);

        //shift
        a = 10;
        b = 13;
        System.out.println(a<<2);
        System.out.println(a>>2);

        //logical
        a=10;
        b=12;
        System.out.println(a>b && ++b>a);
        System.out.println("A is " +a+ "B is "+b);

        //bitwise
        System.out.println(a>b & ++b>a);
        System.out.println("A is " +a+ "B is "+b);

        //ternary
        String result;
        result = (a<b) ? "a is small than b":"b is small than a";
        System.out.println(result);

        //assigment
        System.out.println(a+=b);

    }


}