package superkeyword;

public class A {
    A(){
        System.out.println("I'm in parent class");
    }
}
class B extends A{
    B(){
        System.out.println("I'm in base class");
    }
}
class C extends B{
    C(){
        super();
        System.out.println("I'm in C");
    }

    public static void main(String[] args) {
        C c = new C();
    }
}
