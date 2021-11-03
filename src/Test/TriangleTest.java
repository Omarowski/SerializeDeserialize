package Test;

import Main.Triangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleTest {

    Triangle triangle = new Triangle(2, 4, 5, 3, 10);

    @Test
    void perimeter() {
        double actual = triangle.perimeter();
        assertEquals(11, actual);
    }

    @Test
    void area() {
        double actual = triangle.area();
        assertEquals(15, actual);
    }

    @Test
    void parameters() {
        double a, b, c, base, height;
        a = 2;
        b = 4;
        c = 5;
        base = 3;
        height = 10;
        assertEquals(2, a);
        assertEquals(4, b);
        assertEquals(5, c);
        assertEquals(3, base);
        assertEquals(10, height);


    }
}