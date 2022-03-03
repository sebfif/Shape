package com.company;

public class Main {

    public static void main(String[] args) {

        Rectangles rect1 = new Rectangles();

        rect1.setHeight(10);
        rect1.setWidth(15);


        System.out.println("Højde på rect er: "+ rect1.getHeight()+ " Bredde på rect er: "+ rect1.getWidth());

        Circles cir1 = new Circles(5);

        System.out.println("Radius på circle er: "+cir1.getRadius()+" og diameteren er: "+cir1.getDiameter()+" og arealet er: "+cir1.getArea());

    }
}

