package com.company;
/**
 * [Trapezoid.java]
 * Program that creates Trapezoid object
 * @author Sigil Wen
 * @version 1.0
 * Oct 9th, 2020
 */
public class Trapezoid extends Quadrilateral{
    /**
     * Constructor for the class "Trapezoid"
     * @param x1 int value for the top left x cord
     * @param y1 int value for the top left y cord
     * @param x2 int value for the bottom left x cord
     * @param y2 int value for the bottom left y cord
     * @param topWidth int value for the top width
     * @param bottomWidth int value for the bottom width
     * @param RGB int[] array containing the RGB values of the Trapezoid color
     */
    public Trapezoid(int x1, int y1, int x2, int y2, int topWidth, int bottomWidth, int[] RGB){
        super(x1,y1,x2,y2,x1+topWidth, y1, x2+bottomWidth, y2, RGB);
    }
}
