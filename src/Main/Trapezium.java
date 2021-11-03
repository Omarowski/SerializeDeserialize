package Main;

import java.io.Serializable;

public class Trapezium extends GeoPrimitive implements Serializable {

    private final double b1, b2, h, b3, b4;

    public Trapezium(double b1, double b2, double h, double b3, double b4) {
        this.b1 = b1;
        this.b2 = b2;
        this.h = h;
        this.b3 = b3;
        this.b4 = b4;
    }

    public double getB1() {
        return b1;
    }

    public double getB2() {
        return b2;
    }

    public double getH() {
        return h;
    }

    public double getB3() {
        return b3;
    }

    public double getB4() {
        return b4;
    }

    @Override
    public String toString() {
        return "\n" +"Trapezium{" +
                "b1=" + b1 +
                ", b2=" + b2 +
                ", h=" + h +
                ", b3=" + b3 +
                ", b4=" + b4 +
                '}';
    }

    @Override
    public double perimeter() {
        return b1 + b2 + b3 + b4;
    }

    @Override
    public double area() {
        return ((b1 + b2) * h) / 2;
    }
}
