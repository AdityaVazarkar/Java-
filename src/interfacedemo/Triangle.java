package interfacedemo;

public class Triangle implements Shape{
    private int breath;
    private int height;

    public Triangle(int breath, int height ) {
        this.breath = breath;
        this.height = height;
    }
    @Override
    public double CalculateArea() {

        return (breath * height);
    }
}
