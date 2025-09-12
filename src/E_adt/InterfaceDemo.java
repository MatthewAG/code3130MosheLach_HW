package E_adt;

interface Shape {
    double area();
    double perimeter();

    default void printInfo() {
        IO.println("area = " + area() + ", perimeter = " + perimeter());
    }
}

record Circle(double radius) implements Shape {
    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

record Rectangle(double length, double width) implements Shape {
    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * length + 2 * width;
    }
}

public class InterfaceDemo {
    static void main() {
        Shape c = new Circle(5);
        Shape r = new Rectangle(10, 15);
    }
}
