package Test;

import Main.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {
    Circle circle = new Circle(2);

    @Test
    void perimeter() {
        double actual = circle.perimeter();
        assertEquals(12.566370614359172, actual);
    }

    @Test
    void parameters() {
        double r = 2;
        assertEquals(2, r);

    }

    @Test
    void area() {
        double actual = circle.area();
        assertEquals(12.566370614359172, actual);


    }
}