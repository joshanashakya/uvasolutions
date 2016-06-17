package others;
public class Test {
    public static void main(String[] args) {

        Shape circle = new Circle();
        circle.setRadius(4);
        System.out.println("Area of circle is: " + circle.getArea());
        System.out.println("Perimeter of circle is: " + circle.getPerimeter());

        Rectangle rectangle = new Rectangle();
        rectangle.setLength(5);
        rectangle.setBreadth(5);
        System.out.println("Area of rectangle is: " + rectangle.getArea());
        System.out.println("Perimeter of rectangle is: " + rectangle.getPerimeter());

    }
}

abstract class Shape {
    protected static final String COLOR = "red";

    double radius;

    double length;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    abstract double getArea();

    abstract double getPerimeter();
}

class Circle extends Shape {

    @Override
    double getArea() {
        return 3.1416 * getRadius() * getRadius();
    }

    @Override
    double getPerimeter() {
        return 2 * 3.1416 * getRadius();
    }

}

class Rectangle extends Shape {

    double breadth;

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    @Override
    double getArea() {
        return getLength() * getBreadth();
    }

    @Override
    double getPerimeter() {
        return 2 * (getLength() + getBreadth());
    }

}
