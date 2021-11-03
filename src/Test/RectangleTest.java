package Test;

import Main.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {

    Rectangle rectangle = new Rectangle(3, 4);

    @Test
    void perimeter() {
        double actual = rectangle.perimeter();
        assertEquals(14, actual);
    }

    @Test
    void area() {
        double actual = rectangle.area();
        assertEquals(12, actual);
    }

    @Test
    void parameters() {
        double length, width;
        length = 3;
        width = 4;
        assertEquals(3, length);
        assertEquals(4, width);
    }
}