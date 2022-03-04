package com.company;

public class Circles extends Shapes{
    static int radius;

    public Circles(int r){
        radius = r;
    }

    public int getRadius(){
        return radius;
    }
    public int getDiameter(){
        return radius*2;
    }

}
