package com.company;
import java.awt.Graphics;
/**
 * [DrawingProgram.java]
 * An interface implemented by all shapes
 * @author Sigil Wen
 * @version 1.0
 * Oct 9th, 2020
 */
public interface DrawingProgram {
    /**
     * [draw]
     * method that draws the shape
     * @param g for Graphics object
     */
    void draw(Graphics g);
    /**
     * [getArea]
     * getter method  for area
     * @return double with the value of the area
     */
    double getArea();

    /**
     * [getPerimeter]
     * getter method  for perimeter
     * @return double with the value of the perimeter
     */
    double getPerimeter();
    /**
     * [translateUp]
     * method that translate the shape updwards
     * @param y value to translate by
     */
    void translateUp(int y);
    /**
     * [translateDown]
     * method that translate the shape downwards
     * @param y value to translate by
     */
    void translateDown(int y);
    /**
     * [translateRight]
     * method that translate the shape rightwards
     * @param x value to translate by
     */
    void translateRight(int x);
    /**
     * [translateUp]
     * method that translate the shape leftwards
     * @param x value to translate by
     */
    void translateLeft(int x);

    /**
     * [getXCords]
     * getter method for X cordinates
     * @return int[] array of x coordinates
     */
    int[] getXcords();
    /**
     * [getYCords]
     * getter method for Y cordinates
     * @return int[] array of y coordinates
     */
    int[] getYcords();
}
