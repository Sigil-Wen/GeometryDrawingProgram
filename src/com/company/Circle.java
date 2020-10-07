package com.company;

public class Circle extends Elipse{
    public Circle(int radius, int x1, int y1, int[] RGB){
        super(radius,radius,x1,y1,RGB);
    }
    public double getPerimeter(){ //overiding Circumference formula
        return 2*3.14*this.getRadius();
    }
}
