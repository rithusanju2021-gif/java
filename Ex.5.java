import java.util.*;

abstract class Shape {
    double a, b;
    double area;
    abstract void printArea();
}

class Rectangle extends Shape {
    Rectangle(double length, double breadth) {
        this.a = length;
        this.b = breadth;
    }
    void printArea() {
        area = a * b;
        System.out.println("Area of rectangle: " + area);
    }
}

class Triangle extends Shape {
    Triangle(double base, double height) {
        this.a = base;
        this.b = height;
    }
    void printArea() {
        area = 0.5 * a * b;
        System.out.println("Area of triangle: " + area);
    }
}

class Circle extends Shape {
    Circle(double radius) {
        this.a = radius;
    }
    void printArea() {
        area = 3.14 * a * a;
        System.out.println("Area of circle: " + area);
    }
}

public class Ex.5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the shape:\n1. Rectangle\n2. Triangle\n3. Circle\n4. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("-------Rectangle---------");
                    System.out.println("Enter the length:");
                    double length = sc.nextDouble();
                    System.out.println("Enter the breadth:");
                    double breadth = sc.nextDouble();
                    Shape rect = new Rectangle(length, breadth);
                    rect.printArea();
                    break;

                case 2:
                    System.out.println("-------Triangle---------");
                    System.out.println("Enter the base:");
                    double base = sc.nextDouble();
                    System.out.println("Enter the height:");
                    double height = sc.nextDouble();
                    Shape tri = new Triangle(base, height);
                    tri.printArea();
                    break;

                case 3:
                    System.out.println("-------Circle---------");
                    System.out.println("Enter the radius:");
                    double radius = sc.nextDouble();
                    Shape cir = new Circle(radius);
                    cir.printArea();
                    break;

                case 4:
                    System.out.println("Exiting program.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

