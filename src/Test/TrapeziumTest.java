package Test;

import Main.Trapezium;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TrapeziumTest {
    Trapezium trapezium = new Trapezium(3, 5, 4, 6, 13);
    @Test
    void perimeter() {
        double actual = trapezium.perimeter();
        assertEquals(27, actual);
    }

    @Test
    void area() {
        double actual = trapezium.area();
        assertEquals(16, actual);
    }

    @Test
    void parameters() {
        double b1, b2, b3, b4, h;
        b1 = 3;
        b2 = 5;
        h = 4;
        b3 = 6;
        b4 = 13;
        assertEquals(3, b1);
        assertEquals(5, b2);
        assertEquals(4, h);
        assertEquals(6, b3);
        assertEquals(13, b4);

    }
}