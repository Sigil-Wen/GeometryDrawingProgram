package com.company;
/**
 * [Square.java]
 * Program that creates Square object
 * @author Sigil Wen
 * @version 1.0
 * Oct 9th, 2020
 */

public class Square extends Quadrilateral{
    /**
     * Constructor for the class "Square"
     * @param x1 int value for the top left corner x cord
     * @param y1 int value for the top left corner y cord
     * @param side int value for the square side length
     * @param RGB int[] array containing the RGB values of the Square color
     */
    public Square(int x1, int y1, int side, int[] RGB){
        super(x1,y1,x1+side,y1, x1, y1-side,x1+side, y1-side, RGB);
    }
}
