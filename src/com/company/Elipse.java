package com.company;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class Elipse extends Shape{
    private int width;
    private int height;
    private int[] xcords = new int[1];
    private int[] ycords = new int[1];

    public Elipse(int width, int height, int x1, int y1, int[] RGB){
        super(RGB);
        this.width = width;
        this.height = height;
        this.xcords[0] = x1;
        this.ycords[0] = y1;
    }
    public void draw(Graphics g) {

        int[] color = getColor();
        Color myCol = new Color(color[0],color[1],color[2]);
        g.setColor(myCol);
        g.drawOval(this.xcords[0],this.ycords[0], this.width,this.height);
    }
    public double getArea() {
        return this.width*this.height*3.14;
    }
    public double getPerimeter(){
        return 2*3.14*Math.sqrt((Math.pow(this.width,2)+Math.pow(this.height,2))/2); //approximation
    }
    public int[] getXcords(){
        return this.xcords;
    }
    public int[] getYcords(){
        return this.ycords;
    }
    public void translateUp(int y){
        this.ycords[0]+=y;
    }
    public void translateDown(int y){
        this.ycords[0]-=y;
    }
    public void translateRight(int x){
        this.xcords[0]+=x;
    }
    public void translateLeft(int x){
        this.xcords[0]+=x;
    }
    public double getRadius(){
        return this.width;
    }
}
