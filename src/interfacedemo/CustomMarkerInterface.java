package interfacedemo;

public interface CustomMarkerInterface {
    //empty

}

class Test implements CustomMarkerInterface {
    void display(){
        System.out.println("Hello");
    }
    void show(){
        System.out.println("Good Afternoon");
    }
}
class TestImpl {
    public static void main(String[] args) {
        Test test = new Test();
        if(test instanceof CustomMarkerInterface )
            test.display();
        else
            test.show();
    }
}

