package com.company;
//You will need to use this file for your Geometry Program
//The main method is here. You need to create user I/O and manage an arraylist of shapes
//The method responsible for drawing is here. You need to make sure all your shapes are drawn.
//You will need separate files for all the classes related to shapes
//Once complete you will submit this file as well, make sure it meets RHHS specifications!

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import javax.annotation.processing.SupportedSourceVersion;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

class GeometryDrawingProgram {
    static JFrame frame;
    //You need a create static ArrayList here
    static ArrayList<Shape> shapes = new ArrayList<Shape>();
    static boolean playing;

    //The main method - you will need to add/modify code here
    public static void main(String[] args) {
        GeometryScreen gs = new GeometryScreen();
        Scanner input = new Scanner(System.in);
        //Create a menu here to allow user to add new shapes to the scene
        //Adding a shape means adding an object to an arraylist of objects that contain
        //all items displayed on the screen
        playing = true;

        do {
            //menu options: List shape data,x add a shape, remove a shape, translate a shape, translate drawing, save, load, quit
            System.out.println("~~~~~Geometry Drawing Program~~~~~~");
            System.out.println("1. List shape data");
            System.out.println("2. Add a shape");
            System.out.println("3. Remove a shape");
            System.out.println("4. Translate a shape");
            System.out.println("5. Translate Drawing");
            System.out.println("6. Save Drawing");
            System.out.println("7. Load Drawing");
            System.out.println("8. Quit");

            int selection = input.nextInt();
            switch (selection){
                case 1: //List Shape Data
                    for (int i = 0; i<shapes.size(); i++){
                        Shape currentShape = shapes.get(i);

                        String type = (String)currentShape.getClass().getName(); //remove initial parts
                        System.out.println((i+1) + ". " + type.substring(12));
                        System.out.print("  Coordinates: ");
                        for( int j  = 0 ; j< currentShape.getXcords().length; j++){
                            System.out.printf("(%d,%d) ", currentShape.getXcords()[j], currentShape.getYcords()[j]);
                        }
                        System.out.println();
                        System.out.println("  Area: " + currentShape.getArea());
                        System.out.println("  Perimeter: " + currentShape.getPerimeter());
                        int[] color = currentShape.getColor();
                        System.out.printf("  Color: (%d,%d,%d)", color[0], color[1], color[2]);
                        System.out.println();
                    }
                    if(shapes.size() == 0){
                        System.out.println("There are currently no shapes, create some!");
                    }
                    break;
                case 2: //Add a shape
                    System.out.println("~~~~~Choose a shape~~~~~~");
                    System.out.println("1. Triangle");
                    System.out.println("2. Circle");
                    System.out.println("3. Elipse");
                    System.out.println("4. Square");
                    System.out.println("5. Rhombus");
                    System.out.println("6. Trapezoid");
                    System.out.println("7. Parallelogram");
                    System.out.println("8. Rectangle");
                    System.out.println("9. Cancel");
                    int choice = input.nextInt();
                    switch (choice){
                        case 1:
                            System.out.println("~~~~~Customize Your Triangle~~~~~~");
                            System.out.print("X1 Coordinate: " );
                            int tx1 = input.nextInt();
                            System.out.print("Y1 Coordinate: " );
                            int ty1 = input.nextInt();
                            System.out.print("X2 Coordinate: " );
                            int tx2 = input.nextInt();
                            System.out.print("Y2 Coordinate: " );
                            int ty2 = input.nextInt();
                            System.out.print("X3 Coordinate: " );
                            int tx3 = input.nextInt();
                            System.out.print("Y3 Coordinate: " );
                            int ty3 = input.nextInt();
                            int[] tRGB = new int[3];
                            System.out.print("Color (Red): " );
                            tRGB[0] = input.nextInt();
                            System.out.print("Color (Green): " );
                            tRGB[1] = input.nextInt();
                            System.out.print("Color (Blue): " );
                            tRGB[2] = input.nextInt();
                            Shape newTriangle = new Triangle(tx1,ty1,tx2,ty2,tx3,ty3,tRGB);
                            shapes.add(newTriangle);
                            //add catch
                            System.out.println("Triangle Added!");
                            break;
                        case 2:
                            System.out.println("~~~~~Customize Your Circle~~~~~~");
                            System.out.print("X Coordinate: " );
                            int cxcord = input.nextInt();
                            System.out.print("Y Coordinate: " );
                            int cycord = input.nextInt();
                            System.out.print("Radius: " );
                            int radius = input.nextInt();
                            int[] cRGB = new int[3];
                            System.out.print("Color (Red): " );
                            cRGB[0] = input.nextInt();
                            System.out.print("Color (Green): " );
                            cRGB[1] = input.nextInt();
                            System.out.print("Color (Blue): " );
                            cRGB[2] = input.nextInt();
                            Shape newCircle = new Circle(radius,cxcord,cycord,cRGB);
                            shapes.add(newCircle);
                            //add catch
                            System.out.println("Circle Added!");
                            break;
                        case 3:
                            System.out.println("~~~~~Customize Your Elipse~~~~~~");
                            System.out.print("X Coordinate: " );
                            int excord = input.nextInt();
                            System.out.print("Y Coordinate: " );
                            int eycord = input.nextInt();
                            System.out.print("Width: " );
                            int width = input.nextInt();
                            System.out.print("Height: " );
                            int height = input.nextInt();
                            int[] eRGB = new int[3];
                            System.out.print("Color (Red): " );
                            eRGB[0] = input.nextInt();
                            System.out.print("Color (Green): " );
                            eRGB[1] = input.nextInt();
                            System.out.print("Color (Blue): " );
                            eRGB[2] = input.nextInt();
                            Shape newElipse = new Elipse(width,height,excord,eycord,eRGB);
                            shapes.add(newElipse);
                            //add catch
                            System.out.println("Elipse Added!");
                            break;
                        case 4:
                            System.out.println("~~~~~Customize Your Square~~~~~~");
                            System.out.print("Top Left X Coordinate: " );
                            int squareXCord = input.nextInt();
                            System.out.print("Top Left Y Coordinate: " );
                            int squareYCord = input.nextInt();
                            System.out.print("Sidelength: " );
                            int squareSideLength = input.nextInt();

                            int[] squareRGB = new int[3];
                            System.out.print("Color (Red): " );
                            squareRGB[0] = input.nextInt();
                            System.out.print("Color (Green): " );
                            squareRGB[1] = input.nextInt();
                            System.out.print("Color (Blue): " );
                            squareRGB[2] = input.nextInt();
                            Shape newSquare = new Square(squareXCord,squareYCord,squareSideLength,squareRGB);
                            shapes.add(newSquare);
                            break;

                        case 5:
                            System.out.println("~~~~~Customize Your Rhombus~~~~~~");
                            System.out.print("Top Left X Coordinate: " );
                            int rX1 = input.nextInt();
                            System.out.print("Top Left Y Coordinate: " );
                            int rY1 = input.nextInt();
                            System.out.print("Bottom Left X Coordinate: " );
                            int rX2 = input.nextInt();
                            System.out.print("Bottom Left Y Coordinate: " );
                            int rY2 = input.nextInt();

                            int[] rRGB = new int[3];
                            System.out.print("Color (Red): " );
                            rRGB[0] = input.nextInt();
                            System.out.print("Color (Green): " );
                            rRGB[1] = input.nextInt();
                            System.out.print("Color (Blue): " );
                            rRGB[2] = input.nextInt();
                            Shape newRhombus = new Rhombus(rX1,rY1,rX2,rY2,rRGB);
                            shapes.add(newRhombus);
                            break;
                        case 6:
                            System.out.println("~~~~~Customize Your Trapezoid~~~~~~");
                            System.out.print("Top Left X Coordinate: " );
                            int trapX1 = input.nextInt();
                            System.out.print("Top Left Y Coordinate: " );
                            int trapY1 = input.nextInt();
                            System.out.print("Bottom Left X Coordinate: " );
                            int trapX2 = input.nextInt();
                            System.out.print("Bottom Left Y Coordinate: " );
                            int trapY2 = input.nextInt();
                            System.out.print("Top Side Length: " );
                            int trapTopSide = input.nextInt();
                            System.out.print("Bottom Side Length: " );
                            int trapBottomSide = input.nextInt();

                            int[] trapRGB = new int[3];
                            System.out.print("Color (Red): " );
                            trapRGB[0] = input.nextInt();
                            System.out.print("Color (Green): " );
                            trapRGB[1] = input.nextInt();
                            System.out.print("Color (Blue): " );
                            trapRGB[2] = input.nextInt();
                            Shape newTrapezoid = new Trapezoid(trapX1,trapY1,trapX2,trapY2,trapTopSide,trapBottomSide,trapRGB);
                            shapes.add(newTrapezoid);
                            break;
                        case 7:
                            System.out.println("~~~~~Customize Your Parallelogram~~~~~~");
                            System.out.print("Top Left X Coordinate: " );
                            int pX1 = input.nextInt();
                            System.out.print("Top Left Y Coordinate: " );
                            int pY1 = input.nextInt();
                            System.out.print("Bottom Left X Coordinate: " );
                            int pX2 = input.nextInt();
                            System.out.print("Bottom Left Y Coordinate: " );
                            int pY2 = input.nextInt();
                            System.out.print("Side Length: " );
                            int pSideLength = input.nextInt();

                            int[] pRGB = new int[3];
                            System.out.print("Color (Red): " );
                            pRGB[0] = input.nextInt();
                            System.out.print("Color (Green): " );
                            pRGB[1] = input.nextInt();
                            System.out.print("Color (Blue): " );
                            pRGB[2] = input.nextInt();
                            Shape newParallelogram = new Parallelogram(pX1,pY1,pX2,pY2,pSideLength,pRGB);
                            shapes.add(newParallelogram);
                            break;
                        case 8:
                            System.out.println("~~~~~Customize Your Rectangle~~~~~~");
                            System.out.print("Top Left X Coordinate: " );
                            int rectX1 = input.nextInt();
                            System.out.print("Top Left Y Coordinate: " );
                            int rectY1 = input.nextInt();

                            System.out.print("Width: " );
                            int rectWidth = input.nextInt();
                            System.out.print("Height: " );
                            int recHeight = input.nextInt();

                            int[] rectRGB = new int[3];
                            System.out.print("Color (Red): " );
                            rectRGB[0] = input.nextInt();
                            System.out.print("Color (Green): " );
                            rectRGB[1] = input.nextInt();
                            System.out.print("Color (Blue): " );
                            rectRGB[2] = input.nextInt();
                            Shape newRectangle = new Rectangle(rectX1,rectY1,rectWidth,recHeight,rectRGB);
                            shapes.add(newRectangle);
                            break;
                        case 9:
                            System.out.println("Creation Cancelled");
                            break;
                        default:
                            System.out.print("Please select a valid option.");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("3. Remove a shape");
                    System.out.println("~~~~~Choose a Shape to Remove~~~~~~");
                    if (shapes.size() == 0){
                        System.out.println("There are currently no shapes, add a new shape!");
                    }else{
                        listShapes();
                        int shapeRemoved = input.nextInt();
                        if (shapeRemoved <= shapes.size() && shapeRemoved > 0){
                            shapes.remove(shapeRemoved-1);
                            System.out.println("Shape successfully removed!");
                        }else{
                            System.out.println("That shape is not available");
                        }
                    }
                    break;
                case 4:

                    System.out.println("~~~~~Choose a Shape to Translate~~~~~~");
                    if (shapes.size() == 0){
                        System.out.println("There are currently no shapes, add a new shape!");
                    }else{
                        listShapes();
                        int shapeTransformed = input.nextInt();
                        if (shapeTransformed <= shapes.size() && shapeTransformed > 0){
                            Shape selectedShape = shapes.get(shapeTransformed-1);
                            System.out.print("Selected Shape: ");
                            String type = (String)selectedShape.getClass().getName(); //remove initial parts
                            System.out.println(type.substring(12));
                            System.out.print("Shift up by: ");
                            int up = input.nextInt();
                            System.out.print("Shift down by: ");
                            int down = input.nextInt();
                            System.out.print("Shift right by: ");
                            int right = input.nextInt();
                            System.out.print("Shift left by: ");
                            int left = input.nextInt();
                            selectedShape.translateUp(up);
                            selectedShape.translateDown(down);
                            selectedShape.translateRight(right);
                            selectedShape.translateLeft(left);
                            System.out.println("Shape successfully transformed!");
                        }else{
                            System.out.println("That shape is not available");
                        }
                    }

                    break;
                case 5:
                    System.out.println("~~~~~Translate Drawing~~~~~~");
                    if (shapes.size() == 0){
                        System.out.println("There are currently no shapes, add a new shape!");
                    }else {
                        System.out.print("Shift up by: ");
                        int up = input.nextInt();
                        System.out.print("Shift down by: ");
                        int down = input.nextInt();
                        System.out.print("Shift right by: ");
                        int right = input.nextInt();
                        System.out.print("Shift left by: ");
                        int left = input.nextInt();
                        for (int k = 0; k < shapes.size(); k++) {
                            Shape chosenShape = shapes.get(k);
                            chosenShape.translateUp(up);
                            chosenShape.translateDown(down);
                            chosenShape.translateRight(right);
                            chosenShape.translateLeft(left);
                        }
                        System.out.println("Drawing Successfully transformed!");
                    }
                    break;
                case 6:
                    System.out.println("~~~~~Save Drawing~~~~~~");
                    System.out.println("What would you like to name this drawing?");
                    String saveFile = input.next();
                    saveDrawing(saveFile, shapes);
                    break;
                case 7:
                    System.out.println("~~~~~Load Drawing~~~~~~");
                    System.out.println("What drawing do you want to load?");
                    File folder = new File("./");
                    File[] listOfFiles = folder.listFiles();

                    for (File file : listOfFiles) {
                        if (file.isFile()) {
                            System.out.println(file.getName());
                        }
                    }
                    String loadFile = input.next();
                    if (loadDrawing(loadFile)==null){
                        System.out.print("Could not load in that file");
                        break;
                    }
                    shapes = loadDrawing(loadFile);
                    System.out.print("Shapes updated!");
                    break;
                case 8:
                    System.out.println("Thank you for drawing!");
                    playing = false;
                    break;
                default:
                    System.out.println("Invalid Entry, please try again");
                    break;
            }
            frame.repaint(); //update the screen
            System.out.println("Press enter to continue");
            input.nextLine();
            input.nextLine();

        }while(playing);

    }
    public static void listShapes(){
        for (int i = 0; i<shapes.size(); i++){
            Shape currentShape = shapes.get(i);
            String type = (String)currentShape.getClass().getName(); //remove initial parts
            System.out.println((i+1) + ". " + type.substring(12));
        }
    }
    public static void saveDrawing(String fileName, ArrayList<Shape> drawing){
        try
        {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(shapes);
            oos.close();
            fos.close();
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
    public static ArrayList<Shape> loadDrawing(String fileName){
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        try
        {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);

            shapes = (ArrayList) ois.readObject();

            ois.close();
            fis.close();
            return shapes;
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
            return null;
        }
        catch (ClassNotFoundException c)
        {
            System.out.println("Class not found");
            c.printStackTrace();
            return null;
        }

    }


    //This is an inner class - it has access to the static variables defined above
    public static class GeometryScreen {

        //constructor - do no modify
        GeometryScreen() {
            frame = new JFrame("Geometry Drawing Program 1.0");

            //Create a new "custom" panel for graphics based on the inner class below
            JPanel graphicsPanel = new GraphicsPanel();

            //Add the panel and the frame to the window
            frame.getContentPane().add(graphicsPanel);

            // Set the frame to full screen
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(520,540);
            frame.setUndecorated(false);  //Set to true to remove title bar
            frame.setVisible(true);

        }

        //This is an inner class which contains all the details about drawing to screen.
        public static class GraphicsPanel extends JPanel {


            //The method that draws to the screen - you will need to add.modify code here
            public void paintComponent(Graphics g) {
                setDoubleBuffered(true);
                g.setColor(Color.BLACK);
                //draw the X/Y Axis

                g.drawLine(250, 0, 250, 500);
                g.drawLine(0, 250, 500, 250);

                //Below is a demonstration of how to use graphics commands to draw on to the screen
                //Check the Java Graphics class
                //Note - These coordinates are not based on the x/y axis
                //You will need to draw each of the Shapes contained in your Arraylist here
                for (int i = 0; i<shapes.size(); i++){
                    shapes.get(i).draw(g);
                }
                //This screen will update everytime the menu loop completes
            }
        }
    }
}