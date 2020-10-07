package com.company;

public class Square extends Quadrilateral{
    public Square(int x1, int y1, int side, int[] RGB){
        super(x1,y1,x1+side,y1, x1, y1-side,x1+side, y1-side, RGB);
    }
}
