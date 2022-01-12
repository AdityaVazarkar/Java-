package interfacedemo;

public class Circle implements Shape {
    private int radius;

    public Circle(int radius ) {
        this.radius = radius;

    }

    @Override
    public double CalculateArea() {

        return  ( 3.14 * radius * radius);
    }
}
