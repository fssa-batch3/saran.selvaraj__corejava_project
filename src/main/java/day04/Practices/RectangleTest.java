package day04.Practices;

public class RectangleTest {
    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println("Length: " + square.getLength());
        System.out.println("Breadth: " + square.getBreadth());
        System.out.println("Area: " + square.calculateArea());
    }
}