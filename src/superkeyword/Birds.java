package superkeyword;

/**
 * super method used to invoked parent class method
 */

public class Birds {
    void fly(){
        System.out.println("Birds are Flying");
    }
}
class Pigeon extends Birds{
    void fly(){
        super.fly();
        System.out.println("Pigeon is Flying");
    }

    public static void main(String[] args) {
        Pigeon pigeon = new Pigeon();
        pigeon.fly();
    }
}
