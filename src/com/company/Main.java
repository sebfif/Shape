package com.company;



public class Main {

    public static void main(String[] args) {

        Rectangles rect1 = new Rectangles(40,20);
        Rectangles rect2 = new Rectangles(4,8);
        Circles circ1 = new Circles(6);
        Circles circ2 = new Circles(30);
        Triangles tri1 = new Triangles(10,10,15);
        Triangles tri2 = new Triangles(15,20,30);

        System.out.println("Arealet af rect1 er: " + rect1.getRectangleArea());
        System.out.println("Arealet af rect2 er: " + rect2.getRectangleArea());
        System.out.println("Arealet af circ1 er: " + circ1.getCircleArea() + ", Arealet af circ2 er: " + circ2.getCircleArea());
        System.out.println("Arealet af tri1 er: " + tri1.getTriangleArea() + ", Arealet af tri2 er: " + tri2.getTriangleArea());



    }
}

