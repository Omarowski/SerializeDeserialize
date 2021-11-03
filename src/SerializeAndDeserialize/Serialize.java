package SerializeAndDeserialize;

import Main.*;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Serialize {
    DataOutputStream outputStream;
    public Serialize(String file) throws FileNotFoundException {
        outputStream = new DataOutputStream(new FileOutputStream(file));

    }
    public void write(ArrayList<GeoPrimitive> geoPrimitives) throws IOException {
        for (GeoPrimitive geoPrimitive: geoPrimitives) {
            if(geoPrimitive instanceof Triangle)
                writeLineTriangle((Triangle)geoPrimitive);
            else if(geoPrimitive instanceof Circle)
                writeLineCircle((Circle)geoPrimitive);
            else if(geoPrimitive instanceof Rectangle)
                writeLineSquare((Rectangle) geoPrimitive);
            else if(geoPrimitive instanceof Square)
                writeLineSquare((Square) geoPrimitive);
            else if(geoPrimitive instanceof Trapezium)
                writeLineSquare((Trapezium) geoPrimitive);
            else if(geoPrimitive instanceof Diamond)
                writeLineSquare((Diamond) geoPrimitive);
            else if(geoPrimitive instanceof Parallelogram)
                writeLineSquare((Parallelogram) geoPrimitive);

        }
        outputStream.close();

    }

    private void writeLineSquare(Parallelogram geoPrimitive) throws IOException {
        outputStream.writeBytes("parallelogram a="+geoPrimitive.getA()+
                " b=" +geoPrimitive.getB()+
                " height="+geoPrimitive.getHeight()+
                " Breadth=" + geoPrimitive.getBreadth()+"\n");

    }



    private void writeLineSquare(Trapezium geoPrimitive) throws IOException {
        outputStream.writeBytes("trapezium base1="+geoPrimitive.getB1()+
                                " base2=" +geoPrimitive.getB2()+
                                " base3="+geoPrimitive.getB3()+
                                " base4=" + geoPrimitive.getB4()+
                                " Height="+geoPrimitive.getH()+"\n");
    }

    private void writeLineSquare(Square geoPrimitive) throws IOException {
        outputStream.writeBytes("square size="+geoPrimitive.getSize()+"\n");
    }

    private void writeLineSquare(Rectangle geoPrimitive) throws IOException {
        outputStream.writeBytes("rectangle width="+geoPrimitive.getWidth()+
                                " length="+geoPrimitive.getLength() + "\n");

    }
    private void writeLineSquare(Diamond geoPrimitive) throws IOException {
        outputStream.writeBytes("diamond width="+geoPrimitive.getWidth()+
                                " height="+geoPrimitive.getHeight()  +
                                " height="+geoPrimitive.getS1() + "\n");
    }

    private void writeLineCircle(Circle geoPrimitive) throws IOException {
        outputStream.writeBytes("circle radio="+geoPrimitive.getR()+ "\n");
    }

    private void writeLineTriangle(Triangle geoPrimitive) throws IOException {
        outputStream.writeBytes("triangle sideA="+geoPrimitive.getA()+
                                " sideB="+geoPrimitive.getB()+
                                " sideC="+geoPrimitive.getC()+
                                " base="+geoPrimitive.getBase()+
                                " height="+geoPrimitive.getBase()+"\n");
    }
}
