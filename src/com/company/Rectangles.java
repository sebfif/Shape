package com.company;

public class Rectangles extends Shapes {

       static int height;
        static int width;

        public Rectangles (int h, int w) {
            this.height = h;
           this.width = w;
        }


        public int getHeight () {
            return height;
        }


        public int getWidth () {
            return width;
        }
    }
