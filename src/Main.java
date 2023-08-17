import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Side 1 = ");
        double side1 = scanner.nextDouble();
        System.out.print("Side 2 = ");
        double side2 = scanner.nextDouble();
        System.out.print("Side 3 = ");
        double side3 = scanner.nextDouble();

        Triangle triangle = new Triangle(side1, side2, side3);
        System.out.println(triangle);
        System.out.println("Perimeter = " + triangle.getPerimeter());
        System.out.println("Area = " + triangle.getArea());

        Shape shape = new Shape("red", true);
        System.out.println("\n" + shape);
    }
}