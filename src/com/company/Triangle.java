package com.company;

import java.awt.*;

public class Triangle extends Shape{
    private int[] xcords = new int[3];
    private int[] ycords = new int[3];

    public Triangle( int x1, int y1, int x2, int y2, int x3, int y3, int[] RGB){
        super(RGB);
        this.xcords[0] = x1;
        this.ycords[0] = y1;
        this.xcords[1] = x2;
        this.ycords[1] = y2;
        this.xcords[2] = x3;
        this.ycords[2] = y3;
    }
    public void draw(Graphics g) {

        int[] color = getColor();
        Color myCol = new Color(color[0],color[1],color[2]);
        g.setColor(myCol);
        g.drawPolygon(this.xcords,this.ycords,3);
    }
    public double getArea() { //area negative
       return Math.abs((double)(xcords[0] * (ycords[1] - ycords[2]) + xcords[1] * (ycords[2] - ycords[0]) + xcords[2] * (ycords[0] - ycords[1])) / 2.00);
    }
    public double getPerimeter(){
        double A = Math.sqrt(Math.pow((double)(xcords[0]-xcords[1]), 2) + Math.pow((double)(ycords[0]-ycords[1]), 2));
        double B = Math.sqrt(Math.pow((double)(xcords[2]-xcords[1]), 2) + Math.pow((double)(ycords[2]-ycords[1]), 2));
        double C = Math.sqrt(Math.pow((double)(xcords[0]-xcords[2]), 2) + Math.pow((double)(ycords[0]-ycords[2]), 2));
        return A+B+C;
    }
    public int[] getXcords(){
        return this.xcords;
    }
    public int[] getYcords(){
        return this.ycords;
    }
    public void translateUp(int y){

        this.ycords[0]+=y;
        this.ycords[1]+=y;
        this.ycords[2]+=y;
    }
    public void translateDown(int y){
        this.ycords[0]-=y;
        this.ycords[1]-=y;
        this.ycords[2]-=y;
    }
    public void translateRight(int x){
        this.xcords[0]+=x;
        this.xcords[1]+=x;
        this.xcords[2]+=x;
    }
    public void translateLeft(int x){
        this.xcords[0]+=x;
        this.xcords[1]+=x;
        this.xcords[2]+=x;
    }
}
