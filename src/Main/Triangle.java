package Main;

import java.io.Serializable;

public class Triangle extends GeoPrimitive implements Serializable {
    private final double a, b, c, base, height;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public Triangle(double a, double b, double c, double base, double height) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "\n" +"Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", base=" + base +
                ", height=" + height +
                '}';
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public double area() {
        return (base * height) / 2;
    }
}
