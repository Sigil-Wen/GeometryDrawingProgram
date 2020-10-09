package com.company;
/**
 * [Rectangle.java]
 * Program that creates Rectangle object
 * @author Sigil Wen
 * @version 1.0
 * Oct 9th, 2020
 */

public class Rectangle extends Quadrilateral{
    /**
     * constructor for the class "Rectangle"
     * @param x1 int value for the top left corner x cord
     * @param y1 int value for the top left corner y cord
     * @param width int value for the width
     * @param height int value for the height
     * @param RGB int[] array containing the RGB values for the Rectangle color
     */
    public Rectangle(int x1, int y1, int width,int height, int[] RGB){
        super(x1,y1,x1+width,y1, x1, y1-height,x1+width, y1-height, RGB);
    }
}
