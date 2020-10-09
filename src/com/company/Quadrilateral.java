package com.company;

import java.awt.*;
/**
 * [Quadrilateral.java]
 * Program that creates Quadrilateral object
 * @author Sigil Wen
 * @version 1.0
 * Oct 9th, 2020
 */

public class Quadrilateral extends Shape{
    private int[] xcords = new int[4];
    private int[] ycords = new int[4];

    /**
     * constructor for the class "Quadrilateral"
     * @param x1 int value for the 1st corner x coordinate
     * @param y1 int value for the 1st corner y coordinate
     * @param x2 int value for the 2nd corner x coordinate
     * @param y2 int value for the 2nd corner y coordinate
     * @param x3 int value for the 3rd corner x coordinate
     * @param y3 int value for the 3rd corner y coordinate
     * @param x4 int value for the 4th corner x coordinate
     * @param y4 int value for the 4th corner y coordinate
     * @param RGB int[] array containing the RGB Values for Quadrilateral color
     */

    public Quadrilateral(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int[] RGB)
    {
        super(RGB);
        this.xcords[0] = x1;
        this.ycords[0] = y1;
        this.xcords[1] = x2;
        this.ycords[1] = y2;
        this.xcords[2] = x4;
        this.ycords[2] = y4;
        this.xcords[3] = x3;
        this.ycords[3] = y3;
    }
    /**
     * [draw]
     * method that draws the shape, ensures that the color values are within 0-255
     * @param g for Graphics object
     */
    public void draw(Graphics g) {

        try {
            int[] color = getColor();
            Color myCol = new Color(color[0],color[1],color[2]);
            g.setColor(myCol);
            g.drawPolygon(this.xcords,this.ycords,4);
        }catch (Exception e){
            System.out.println("Could not create Shape. Please make sure your RGB Color is an integer between 0 and 255.");
        }

    }
    /**
     * [getArea]
     * getter method  for area
     * @return double with the value of the area
     */
    public double getArea(){
        double triangle1 = Math.abs((double)(xcords[0] * (ycords[1] - ycords[2]) + xcords[1] * (ycords[2] - ycords[0]) + xcords[2] * (ycords[0] - ycords[1])) / 2.00);
        double triangle2 = Math.abs((double)(xcords[3] * (ycords[1] - ycords[2]) + xcords[1] * (ycords[2] - ycords[3]) + xcords[2] * (ycords[3] - ycords[1])) / 2.00);
        return triangle1 + triangle2;
    }
    /**
     * [getPerimeter]
     * getter method  for perimeter
     * @return double with the value of the perimeter
     */
    public double getPerimeter(){
        double A = Math.sqrt(Math.pow((double)(xcords[0]-xcords[1]), 2) + Math.pow((double)(ycords[0]-ycords[1]), 2));
        double B = Math.sqrt(Math.pow((double)(xcords[2]-xcords[1]), 2) + Math.pow((double)(ycords[2]-ycords[1]), 2));
        double C = Math.sqrt(Math.pow((double)(xcords[3]-xcords[2]), 2) + Math.pow((double)(ycords[3]-ycords[2]), 2));
        double D = Math.sqrt(Math.pow((double)(xcords[3]-xcords[0]), 2) + Math.pow((double)(ycords[3]-ycords[0]), 2));
        return A+B+C+D;
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
     * @return an int array containing X coordinates
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
        this.ycords[1]+=y;
        this.ycords[2]+=y;
        this.ycords[3]+=y;
    }
    /**
     * [translateDown]
     * method that translate the shape downwards
     * @param y value for amount to translate down by
     */
    public void translateDown(int y){
        this.ycords[0]-=y;
        this.ycords[1]-=y;
        this.ycords[2]-=y;
        this.ycords[3]-=y;
    }
    /**
     * [translateRight]
     * method that translate the shape rightwards
     * @param x value for amount to translate right by
     */
    public void translateRight(int x){
        this.xcords[0]+=x;
        this.xcords[1]+=x;
        this.xcords[2]+=x;
        this.xcords[3]-=x;
    }
    /**
     * [translateLeft]
     * method that translate the shape leftwards
     * @param x value for amount to translate left by
     */
    public void translateLeft(int x){
        this.xcords[0]+=x;
        this.xcords[1]+=x;
        this.xcords[2]+=x;
        this.xcords[3]+=x;
    }

}
