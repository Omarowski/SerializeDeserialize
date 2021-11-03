package Test;

import Main.Parallelogram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParallelogramTest {
    Parallelogram parallelogram = new Parallelogram(3, 4, 5, 4);

    @Test
    void perimeter() {
        double actual = parallelogram.perimeter();
        assertEquals(14, actual);
    }

    @Test
    void area() {
        double actual = parallelogram.area();
        assertEquals(20, actual);
    }

    @Test
    void parameters() {
        double a, b, height, breadth;
        a = 3;
        b = 4;
        height = 5;
        breadth = 4;
        assertEquals(3, a);
        assertEquals(4, b);
        assertEquals(5, height);
        assertEquals(4, breadth);
    }
}