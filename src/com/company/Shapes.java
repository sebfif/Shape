package com.company;


public class Shapes {


    public Shapes() {
    }


    Integer height;
    Integer width;
    Integer radius;
    Integer katete1;
    Integer katete2;
    Integer hypotenusen;

    public double getArea(){
        if (height > 0 && width > 0 && radius == null && katete1 == null){
            return height*width;
        }
        if (radius > 0){
            return Math.PI*(radius*radius);
        }

        return height*width;
    }


}
