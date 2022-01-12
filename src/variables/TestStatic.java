package variables;

public class TestStatic {

    static int i = 10;
    void display(){
     int j = 10;
     System.out.println("i = "+i +" & j = "+j);
     ++i;
     ++j;
    }
    public static void main(String[] args){
        TestStatic testStatic = new TestStatic();
        testStatic.display();
        testStatic.display();
    }
}
