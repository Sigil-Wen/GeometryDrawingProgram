package com.company;

public class Parallelogram extends Quadrilateral{
    public Parallelogram(int x1, int y1, int x2, int y2, int width, int[] RGB){
        super(x1,y1, x2, y2, x1 + width, y1, x2 + width, y2, RGB);
    }
}
