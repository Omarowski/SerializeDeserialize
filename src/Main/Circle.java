package Main;

import java.io.Serializable;

public class Circle extends GeoPrimitive implements Serializable {
    private final double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    @Override
    public String toString() {
        return "\n" +"Circle{" +
                "r=" + r +
                '}';
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public double area() {
        return Math.PI * r * r;
    }
}
