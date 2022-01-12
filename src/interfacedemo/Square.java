package interfacedemo;

public class Square implements Shape {
    private int side;

    public Square(int side ) {
        this.side = side;
    }

    @Override
    public double CalculateArea() {

        return (side * side);
    }
}
