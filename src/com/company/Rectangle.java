package com.company;

public class Rectangle extends Quadrilateral{
    public Rectangle(int x1, int y1, int width,int height, int[] RGB){
        super(x1,y1,x1+width,y1, x1, y1-height,x1+width, y1-height, RGB);
    }
}
