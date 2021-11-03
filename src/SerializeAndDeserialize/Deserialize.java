package SerializeAndDeserialize;

import Main.*;
import org.junit.platform.commons.util.StringUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Deserialize {
  FileInputStream fileInputStream;

  public Deserialize(String filename) throws FileNotFoundException {
    fileInputStream = new FileInputStream(filename);
    BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
  }

  public List<GeoPrimitive> read() throws IOException {
    List<GeoPrimitive> geoPrimitives = new ArrayList<>();
    // Construct BufferedReader from InputStreamReader
    BufferedReader br = new BufferedReader(new InputStreamReader(fileInputStream));
    String line = null;
    while ((line = br.readLine()) != null) {
      if (line.contains("rectangle")) {
        String[] tokens = line.split(" ");
        Rectangle rectangle =
            new Rectangle(
                Double.parseDouble(tokens[1].substring(tokens[1].lastIndexOf("=")+1 )),
                Double.parseDouble(tokens[2].substring(tokens[2].lastIndexOf("=") +1)));
        geoPrimitives.add(rectangle);
      }else if (line.contains("diamond")) {
        String[] tokens = line.split(" ");
        Diamond diamond =
                new Diamond(
                        Double.parseDouble(tokens[1].substring(tokens[1].lastIndexOf("=") + 1)),
                        Double.parseDouble(tokens[2].substring(tokens[2].lastIndexOf("=") + 1)),
                        Double.parseDouble(tokens[3].substring(tokens[3].lastIndexOf("=") + 1)));
        geoPrimitives.add(diamond);
      }else if (line.contains("parallelogram")) {
        String[] tokens = line.split(" ");
        Parallelogram parallelogram =
                new Parallelogram(
                        Double.parseDouble(tokens[1].substring(tokens[1].lastIndexOf("=") + 1)),
                        Double.parseDouble(tokens[2].substring(tokens[2].lastIndexOf("=") + 1)),
                        Double.parseDouble(tokens[3].substring(tokens[3].lastIndexOf("=") + 1)),
                        Double.parseDouble(tokens[4].substring(tokens[4].lastIndexOf("=") + 1)));
        geoPrimitives.add(parallelogram);
      }if (line.contains("circle")) {
          String[] tokens = line.split(" ");
          Circle circle =
                  new Circle(
                          Double.parseDouble(tokens[1].substring(tokens[1].lastIndexOf("=") + 1)));
          geoPrimitives.add(circle);
      }if (line.contains("square")) {
            String[] tokens = line.split(" ");
            Square square =
                    new Square(
                            Double.parseDouble(tokens[1].substring(tokens[1].lastIndexOf("=") + 1)));
            geoPrimitives.add(square);
      }if (line.contains("trapezium")) {
              String[] tokens = line.split(" ");
              Trapezium trapezium =
                      new Trapezium(
                              Double.parseDouble(tokens[1].substring(tokens[1].lastIndexOf("=") + 1)),
                              Double.parseDouble(tokens[2].substring(tokens[2].lastIndexOf("=") + 1)),
                              Double.parseDouble(tokens[3].substring(tokens[3].lastIndexOf("=") + 1)),
                              Double.parseDouble(tokens[4].substring(tokens[4].lastIndexOf("=") + 1)),
                              Double.parseDouble(tokens[5].substring(tokens[5].lastIndexOf("=") + 1)));
              geoPrimitives.add(trapezium);
      }if (line.contains("triangle")) {
                String[] tokens = line.split(" ");
                Triangle triangle =
                        new Triangle(
                                Double.parseDouble(tokens[1].substring(tokens[1].lastIndexOf("=") + 1)),
                                Double.parseDouble(tokens[2].substring(tokens[2].lastIndexOf("=") + 1)),
                                Double.parseDouble(tokens[3].substring(tokens[3].lastIndexOf("=") + 1)),
                                Double.parseDouble(tokens[4].substring(tokens[4].lastIndexOf("=") + 1)),
                                Double.parseDouble(tokens[5].substring(tokens[5].lastIndexOf("=") + 1)));
                geoPrimitives.add(triangle);
      }


     }

    br.close();
    return geoPrimitives;
  }
}
