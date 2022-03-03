package com.company;

public class Circles {
    private int radius;

    public Circles(int r){
        radius =r;
    }


    public void setRadius(int r){
        r=radius;
    }
    public int getRadius(){
        return radius;
    }
    public int getDiameter(){
        return radius*2;
    }
    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }
}
