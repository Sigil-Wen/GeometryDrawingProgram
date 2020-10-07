package com.company;

public class Rhombus extends Quadrilateral{
    public Rhombus(int x1, int y1, int x2, int y2, int[] RGB){
        super(x1,y1,x2,y2,x1+ (int)Math.floor(Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2))),y1,x2+ (int)Math.floor(Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2))), y2, RGB);
    }
}
