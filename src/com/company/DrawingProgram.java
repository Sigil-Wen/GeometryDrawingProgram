package com.company;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public interface DrawingProgram {
    void draw(Graphics g);
    double getArea();
    double getPerimeter();
    void translateUp(int y);
    void translateDown(int y);
    void translateRight(int x);
    void translateLeft(int x);
    int[] getXcords();
    int[] getYcords();

}
