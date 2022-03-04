package com.company;

public class Rectangles {

        private int height;
        private int width;

        public Rectangles () {
        }

        public void setHeight ( int ht){
            if (ht > 0) {
                height = ht;
            }
        }

        public int getHeight () {
            return height;
        }

        public void setWidth ( int w){
            if (w > 0) {
                width = w;
            }
        }

        public int getWidth () {
            return width;
        }
    }
