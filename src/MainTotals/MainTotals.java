package MainTotals;

import Main.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class MainTotals {
    List<GeoPrimitive> geoPrimitives = new ArrayList<>();
    Circle circle;
    Diamond diamond;
    Parallelogram parallelogram;
    Rectangle rectangle;
    Square square;
    Trapezium trapezium;
    Triangle triangle;

    @BeforeEach
    void setUp() {

        circle = new Circle(2);
        diamond = new Diamond(3, 4, 6);
        parallelogram = new Parallelogram(3, 5, 4, 8);
        rectangle = new Rectangle(3, 4);
        square = new Square(2);
        trapezium = new Trapezium(6, 7, 8, 9, 35);
        triangle = new Triangle(23, 4, 5, 6, 7);
        geoPrimitives.add(circle);
        geoPrimitives.add(diamond);
        geoPrimitives.add(parallelogram);
        geoPrimitives.add(rectangle);
        geoPrimitives.add(square);
        geoPrimitives.add(trapezium);
        geoPrimitives.add(triangle);
    }


    @Test
     void totalPerimeter() {
        double actual = geoPrimitives.stream().map(GeoPrimitive::perimeter).reduce(Double::sum).get();
        double expected = 163.5663706143592;
        assertEquals(expected, actual);
    }

    @Test
    void totalArea() {
        double actual = geoPrimitives.stream().map(GeoPrimitive::area).reduce(Double::sum).get();
        double expected = 145.5663706143592;
        assertEquals(expected, actual);
    }
}
