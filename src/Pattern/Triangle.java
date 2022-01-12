package Pattern;

public class Triangle extends Shape{
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
