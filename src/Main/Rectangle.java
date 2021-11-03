package Main;

import java.io.Serializable;

public class Rectangle extends GeoPrimitive implements Serializable {
    private static final long serialVersionUID = 1234L;
    private final double length, width;

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    @Override
    public double perimeter() {
        return length + length + width + width;
    }

    @Override
    public double area() {
        return length * width;
    }
}
