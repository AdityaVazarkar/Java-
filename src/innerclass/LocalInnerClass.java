package innerclass;

class LocalOuter{
    void display(){
        class LocalInner{
            int n=10;
            void show(){
                System.out.println("No is:-"+n);
            }
        }
        LocalInner inner = new LocalInner();
        inner.show();
    }
}

public class LocalInnerClass {
    public static void main(String[] args) {
        LocalOuter outer = new LocalOuter();
        outer.display();
    }
}
