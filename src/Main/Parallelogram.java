package Main;

import java.io.Serializable;

public class Parallelogram extends GeoPrimitive implements Serializable {
    private final double a, b, height, breadth;

    public Parallelogram(double a, double b, double height, double breadth) {
        this.a = a;
        this.b = b;
        this.height = height;
        this.breadth = breadth;
    }

    @Override
    public String toString() {
        return "\n"+"Parallelogram{" +
                "a=" + a +
                ", b=" + b +
                ", height=" + height +
                ", breadth=" + breadth +
                '}';
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getHeight() {
        return height;
    }

    public double getBreadth() {
        return breadth;
    }

    @Override
    public double perimeter() {
        return (a + b) * 2;
    }

    @Override
    public double area() {
        return height * breadth;
    }
}
