package Test;

import Main.Diamond;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DiamondTest {

    Diamond diamond = new Diamond(1, 2, 3);

    @Test
    void perimeter() {
        double actual = diamond.perimeter();
        assertEquals(12, actual);
    }

    @Test
    void area() {
        double actual = diamond.area();
        assertEquals(2, actual);
    }

    @Test
    void parameters() {
        double width, height, s1;
        width = 1;
        height = 2;
        s1 = 3;
        assertEquals(1, width);
        assertEquals(2, height);
        assertEquals(3, s1);

    }
}