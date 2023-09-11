class Shape {
    private String color;
    private boolean filled;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled); // Call the superclass constructor to initialize color and filled
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled); // Call the superclass constructor to initialize color and filled
        this.width = width;
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
}

public class classShape {
    public static void main(String[] args) {
        Circle myCircle = new Circle("Red", true, 5.0);

        Rectangle myRectangle = new Rectangle("Blue", false, 4.0, 6.0);

        System.out.println("Circle Area: " + myCircle.getArea());
        System.out.println("Rectangle Area: " + myRectangle.getArea());
    }
}
