package com.company;
/**
 * [Shape.java]
 * Abstract class Shape that implements Serializable and DrawingProgram interfaces
 * @author Sigil Wen
 * @version 1.0
 * Oct 9th, 2020
 */

import java.awt.Graphics;

abstract class Shape implements DrawingProgram, java.io.Serializable{
    private int[] RGB;

    /**
     * Constructor for the class "Shape"
     * @param RGB int[] array containing the RGB values for the shape's color
     */
    public Shape(int[] RGB){
        this.RGB = RGB;
    }
    /**
     * [getColor]
     * getter method for a shapes color
     * @return int[] array storing RGB values for the shapes color
     */

    public int[] getColor(){
        return this.RGB;
    }
    /**
     * [draw]
     * an abstract method that draws the shape
     * @param g for Graphics object
     */
    public abstract void draw(Graphics g);
    /**
     * [getPerimeter]
     * abstract getter method  for perimeter
     * @return double with the value of the perimeter
     */
    public abstract double getArea();
    /**
     * [getPerimeter]
     * abstract getter method  for perimeter
     * @return double with the value of the perimeter
     */
    public abstract double getPerimeter();
    /**
     * [translateUp]
     * an abstract method
     */
    public abstract void translateUp(int y);
    /**
     * [translateDown]
     * an abstract method
     */
    public abstract void translateDown(int y);
    /**
     * [translateRight]
     * an abstract method
     */
    public abstract void translateRight(int x);
    /**
     * [translateLeft]
     * an abstract method
     */
    public abstract void translateLeft(int x);
    /**
     * [getXcords]
     * an abstract getter method that returns X Coordinates
     */
    public abstract int[] getXcords();
    /**
     * [getYcords]
     * an abstract getter method that returns Y Coordinates
     */
    public abstract int[] getYcords();

}
