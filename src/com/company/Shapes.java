package com.company;

import static com.company.Circles.radius;
import static com.company.Rectangles.height;
import static com.company.Rectangles.width;
import static com.company.Triangles.*;

public class Shapes {


    //public Shapes() {
    //}

    //Vi ville her gerne have lavet en metode som kunne udregne arealet af alle slags former vi ville indsætte-
    //istedet for at lave kode til de tre former hver især.

    public int getTriangleArea () {
        return (side1 + side2 + side3) /2;
    }

    public int getRectangleArea () {
        return height * width;
    }

    public double getCircleArea () {
        return Math.PI*Math.pow(radius,2);
    }
}
