package Main;

import SerializeAndDeserialize.Deserialize;
import SerializeAndDeserialize.Serialize;
import SerializeAndDeserialize.SerializeFormat;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    // Square square = new Square(4);

    Rectangle rectangle = new Rectangle(3, 4);
    Square square = new Square(2);
    Circle circle = new Circle(2);
    Diamond diamond = new Diamond(3, 4, 6);
    Parallelogram parallelogram = new Parallelogram(3, 5, 4, 8);
    Triangle triangle = new Triangle(23, 4, 5, 6, 7);
    Trapezium trapezium = new Trapezium(6, 7, 8, 9, 35);

    ArrayList<GeoPrimitive> geoPrimitives = new ArrayList<GeoPrimitive>();

    geoPrimitives.add(rectangle);
    geoPrimitives.add(square);
    geoPrimitives.add(circle);
    geoPrimitives.add(diamond);
    geoPrimitives.add(parallelogram);
    geoPrimitives.add(triangle);
    geoPrimitives.add(trapezium);

    System.out.println("Serializing ----------- ");
    System.out.println("\n"+geoPrimitives);
    String filename = "data" + new SimpleDateFormat("yyyyMMddHHmm'.txt'").format(new Date());
    try {
      Serialize serialize = new Serialize(filename);
      serialize.write(geoPrimitives);
    } catch (IOException e) {
      e.printStackTrace();
    }
    Deserialize deserialize = null;
    try {
      deserialize = new Deserialize(filename);
      List geoList = deserialize.read();
      System.out.println("\n"+"DESERIALIZING");
      System.out.println(geoList);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }


  }
}
