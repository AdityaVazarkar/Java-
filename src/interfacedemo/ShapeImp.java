package interfacedemo;

import Pattern.Circle;
import Pattern.Rectangle;
import Pattern.Shape;
import Pattern.Square;
import Pattern.Triangle;

import java.util.Scanner;

public class ShapeImp {
    public static void main(String[] args) {
        int ch;

        do{
            System.out.println("1:Triangle");
            System.out.println("2:Rectangle");
            System.out.println("3:Circle");
            System.out.println("4:Square");
            System.out.println("5:Exit");
            System.out.println("Enter your choice");
            Scanner scanner = new Scanner(System.in);
            ch = scanner.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter breath & height:");
                    int breadth = scanner.nextInt();
                    int height = scanner.nextInt();
                    Shape triangle = new Triangle(breadth,height);
                    System.out.println("Area of Triangle:-"+triangle.CalculateArea());
                    break;
                case 2:
                    System.out.println("Enter length & breath & height:");
                    int length = scanner.nextInt();
                    int brea = scanner.nextInt();
                    int hei = scanner.nextInt();
                    Shape rectangle = new Rectangle(length,brea,hei);
                    System.out.println("Area of Rectangle:-"+rectangle.CalculateArea());
                    break;
                case 3:
                    System.out.println("Enter radius:");
                    int radius = scanner.nextInt();
                    Shape circle = new Circle(radius);
                    System.out.println("Area of Circle:-"+circle.CalculateArea());
                    break;
                case 4:
                    System.out.println("Enter Side");
                    int side = scanner.nextInt();
                    Shape square = new Square(side);
                    System.out.println("Area of Square:-"+square.CalculateArea());

                    break;
                case 5:
                    System.out.println("exit");
            }

        }while (ch<5);
    }
}
