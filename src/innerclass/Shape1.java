package innerclass;

public interface Shape1 {
     void getMsg();
}
class ShapeImp{
    Shape1 sp = new Shape1() {
        @Override
        public void getMsg() {
            System.out.println("Hi Aditya");
        }
    };

    public static void main(String[] args) {
        ShapeImp si = new ShapeImp();
        si.sp.getMsg();
    }
}
