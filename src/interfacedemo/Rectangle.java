package interfacedemo;

public class Rectangle implements Shape {
    private  int length;
    private int brea;
    private int hei;

    public Rectangle(int breath, int height,int length ) {
        this.length = length;
        this.brea = breath;
        this.hei = height;
    }
    @Override
    public double CalculateArea() {
        return (length* brea * hei);
    }
}
