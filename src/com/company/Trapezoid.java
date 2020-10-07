package com.company;

public class Trapezoid extends Quadrilateral{
    public Trapezoid(int x1, int y1, int x2, int y2, int topWidth, int bottomWidth, int[] RGB){
        super(x1,y1,x2,y2,x1+topWidth, y1, x2+bottomWidth, y2, RGB);
    }
}
