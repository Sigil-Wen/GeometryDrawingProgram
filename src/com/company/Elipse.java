package com.company;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
/**
 * [Elipse.java]
 * Program that creates Elipse object
 * @author Sigil Wen
 * @version 1.0
 * Oct 9th, 2020
 */

public class Elipse extends Shape{
    private int width;
    private int height;
    private int[] xcords = new int[1];
    private int[] ycords = new int[1];

    /**
     * constructor for the class "Elipse"
     * @param width int value for the width of the elipse
     * @param height int value for the height of the elipse
     * @param x1 int value for the centre x coordinate
     * @param y1 int value for the centre y coordinate
     * @param RGB int[] array containing the RGB values for the elipse color
     */

    public Elipse(int width, int height, int x1, int y1, int[] RGB){
        super(RGB);
        this.width = width;
        this.height = height;
        this.xcords[0] = x1;
        this.ycords[0] = y1;
    }
    /**
     * [draw]
     * method that draws the shape, ensures that the color values are within 0-255
     * @param g for Graphics object
     */
    public void draw(Graphics g) {
    try{
        int[] color = getColor();
        Color myCol = new Color(color[0], color[1], color[2]);
        g.setColor(myCol);
        g.drawOval(this.xcords[0], this.ycords[0], this.width, this.height);
        }
        catch (Exception e){
            System.out.println("Could not create Shape. Please make sure your RGB Color is an integer between 0 and 255.");
        }
    }
    /**
     * [getArea]
     * Getter method that calculates the area of a Elipse using it's width and height
     * @return a double with the value of the Elipse's Area
     */
    public double getArea() {
        return this.width*this.height*3.14;
    }
    /**
     * [getPerimeter]
     * Getter method that calculates the perimeter of a Elipse using the width and height
     * @return a double with the value of the Elipse's Perimeter
     */
    public double getPerimeter(){
        return 2*3.14*Math.sqrt((Math.pow(this.width,2)+Math.pow(this.height,2))/2); //approximation
    }
    /**
     * [getXcords]
     * getter method that returns X Coordinates
     * @return an int array containing x coordinates
     */
    public int[] getXcords(){
        return this.xcords;
    }
    /**
     * [getYcords]
     * getter method that returns Y Coordinates
     * @return an int array containing Y coordinates
     */
    public int[] getYcords(){
        return this.ycords;
    }
    /**
     * [translateUp]
     * method that translate the shape updwards
     * @param y value for amount to translate up by
     */
    public void translateUp(int y){
        this.ycords[0]+=y;
    }
    /**
     * [translateDown]
     * method that translate the shape downwards
     * @param y value for amount to translate down by
     */
    public void translateDown(int y){
        this.ycords[0]-=y;
    }
    /**
     * [translateRight]
     * method that translate the shape rightwards
     * @param x value for amount to translate Right by
     */
    public void translateRight(int x){
        this.xcords[0]+=x;
    }
    /**
     * [translateLeft]
     * method that translate the shape Leftwards
     * @param x value for amount to translate left by
     */
    public void translateLeft(int x){
        this.xcords[0]+=x;
    }
    /**
     * [getRadius]
     * Getter method that returns the radius
     * @return a double with the value of the radius
     */
    public double getRadius(){
        return this.width;
    }
}
