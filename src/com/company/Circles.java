package com.company;

public class Circles extends Shapes{


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
