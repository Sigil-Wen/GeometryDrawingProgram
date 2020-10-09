package com.company;

/**
 * [Circle.java]
 * Program that creates Circle object
 * @author Sigil Wen
 * @version 1.0
 * Oct 9th, 2020
 */

public class Circle extends Elipse{
    /**
     * Constructor for the class "Circle"
     * @param radius an integer determining the circle's radius
     * @param x1 an integer value for the centre's x coordinate
     * @param y1 an integer value for the centre's y coordinate
     * @param RGB an int[] array containing the three RGB values for the Circle's color
     */

    public Circle(int radius, int x1, int y1, int[] RGB){
        super(radius,radius,x1,y1,RGB);
    }

    /**
     * [getPerimeter]
     * Getter method that calculates the circumference of a circle using it's radius and the circumference formula
     * Overides the parent function getPerimeter
     * @return a double with the value of the Circle's Circumference
     */

    public double getPerimeter(){
        return 2*3.14*this.getRadius();
    }
}
