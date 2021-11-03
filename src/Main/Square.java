package Main;

import java.io.Serializable;

public class Square extends GeoPrimitive implements Serializable {
    private final double size;

    public Square(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "\n" +"Square{" +
                "size=" + size +
                '}';
    }

    @Override
    public double perimeter() {
        return size * 4;
    }

    @Override
    public double area() {
        return size * size;
    }
}
