package Lesson_1;

/**
 * Figura
 */
public abstract class Figura {

     abstract double calculateArea();

     abstract double calculatePerimetr();

    public static void main(String[] args) {
        System.out.println(1);
        Circle krug1 = new Circle();
        Circle krug2 = new Circle(5);
        System.out.println("Area krug1 = "     + krug1.calculateArea());
        System.out.println("Area krug2 = "     + krug2.calculateArea());
        System.out.println("Perimetr krug1 = " + krug1.calculatePerimetr());
        System.out.println("Perimetr krug2 = " + krug2.calculatePerimetr());

        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(3,5);
        System.out.println("Area rectangle1 = " + rectangle1.calculateArea());
        System.out.println("Area rectangle2 = " + rectangle2.calculateArea());
        System.out.println("Perimetr krug1 = "  + rectangle1.calculatePerimetr());
        System.out.println("Perimetr krug2 = "  + rectangle2.calculatePerimetr());

        Square square1 = new Square();
        Square square2 = new Square(4);
        System.out.println("Area square1 = "   + square1.calculateArea());
        System.out.println("Area square2 = "   + square2.calculateArea());
        System.out.println("Perimetr krug1 = " + square1.calculatePerimetr());
        System.out.println("Perimetr krug2 = " + square2.calculatePerimetr());
 

    }
}