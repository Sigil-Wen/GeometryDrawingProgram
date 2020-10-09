package com.company;
/**
 * [Parallelogram.java]
 * Program that creates Parallelogram object
 * @author Sigil Wen
 * @version 1.0
 * Oct 9th, 2020
 */
public class Parallelogram extends Quadrilateral{
    /**
     * constructor for the class "Parallelogram"
     * @param x1 int value for the top left x corner coordinate
     * @param y1 int value for the top left y corner coordinate
     * @param x2 int value for the bottom x corner coordinate
     * @param y2 int value for the bottom y corner coordinate
     * @param width int value for the width of the parallelogram
     * @param RGB int[] array containing the RGB values for the parallelogram color
     */
    public Parallelogram(int x1, int y1, int x2, int y2, int width, int[] RGB){
        super(x1,y1, x2, y2, x1 + width, y1, x2 + width, y2, RGB);
    }
}
