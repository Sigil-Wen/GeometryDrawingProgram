package com.company;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.io.Serializable;

abstract class Shape implements DrawingProgram, java.io.Serializable{
    private int[] RGB;

    public Shape(int[] RGB){
        this.RGB = RGB;
    }

    public int[] getColor(){
        return this.RGB;
    }
    public abstract void draw(Graphics g);
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract void translateUp(int y);
    public abstract void translateDown(int y);
    public abstract void translateRight(int x);
    public abstract void translateLeft(int x);
    public abstract int[] getXcords();
    public abstract int[] getYcords();

}
