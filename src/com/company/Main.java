package com.company;

public class Main {

    public static void main(String[] args) {

        Rectangles rect1 = new Rectangles();

        rect1.setHeight(10);
        rect1.setWidth(15);


        System.out.println("Højde på rect er: "+ rect1.getHeight()+ " Bredde på rect er: "+ rect1.getWidth());

        Circles cir1 = new Circles(5);

        System.out.println("Radius på circle er: "+cir1.getRadius()+" og diameteren er: "+cir1.getDiameter()+" og arealet er: "+cir1.getArea());

        Triangles tri1 = new Triangles(1, 1, 1);

        System.out.println("Triangle: Side 1 = " + tri1.getSide1() + "cm, Side 2 = " + tri1.getSide2()
                + "cm, Side 3 = " + tri1.getSide3() + "cm, Arealet på tri1 er: " + tri1.getArea() + "cm2, Omkredsen på tri1 er: " + tri1.getPerimeter());
    }
}

