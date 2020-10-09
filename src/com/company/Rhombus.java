package com.company;
/**
 * [Rhombus.java]
 * Program that creates Rhombus object
 * @author Sigil Wen
 * @version 1.0
 * Oct 9th, 2020
 */
public class Rhombus extends Quadrilateral{
    /**
     * Constructor for the class "Rhombus"
     * @param x1 int value for the top left x cord
     * @param y1 int value for the top right y cord
     * @param x2 int value for the bottom left x cord
     * @param y2 int value for the bottom left y cord
     * @param RGB int[] array containing the RGB values for the Rhombus color
     */
    public Rhombus(int x1, int y1, int x2, int y2, int[] RGB){
        super(x1,y1,x2,y2,x1+ (int)Math.floor(Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2))),y1,x2+ (int)Math.floor(Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2))), y2, RGB);
    }
}
