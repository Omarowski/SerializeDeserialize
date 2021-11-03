package Main;

import java.io.Serializable;

public class Diamond extends GeoPrimitive implements Serializable {
    private final double width, height, s1;

    public Diamond(double width, double height, double s1) {
        this.width = width;
        this.height = height;
        this.s1 = s1;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getS1() {
        return s1;
    }

    @Override
    public String toString() {
        return "\n" +"Diamond{" +
                "width=" + width +
                ", height=" + height +
                ", s1=" + s1 +
                '}';
    }

    @Override
    public double perimeter() {
        return s1 * 4;
    }

    @Override
    public double area() {
        return width * height;
    }
}
