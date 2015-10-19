//Alec Tilley
//10-20-15
//CSE2
//hw08
//This program will Calculate the area of 3 shapes based on the user inputted values
//import the scanner
import java.util.Scanner;
//Create a public class
public class Area{
    public static double rectArea(double width, double length){ //Adding a method to calculate the area of a rectangle
    return width * length;
    }
    
    public static double triArea(double base, double height){ //Adding a method to calculate the area of a triangle
    return (.5)*base *height;
    }
    
    public static double circArea(double radius){ //Adding a method to calculate the area of a circle
    return (3.14159)*radius*radius;
    }

    public static void main(String[] args){ //adding a main method
    //Declaring variables that are used later
        double length1 =0;
        double width1=0;
        double base1=0;
        double height1=0;
        double radius1=0;
    
        Scanner shape = new Scanner( System.in );  //Declaring an instance of the shape scanner
        Scanner baseIn = new Scanner( System.in ); //Declaring an instance of the base scanner
        Scanner heightIn = new Scanner( System.in ); //declaring an instance of the height scanner
        Scanner lengthIn = new Scanner( System.in ); //Declaring an instance of the length scanner
        Scanner widthIn = new Scanner( System.in ); //Declaring an instance of the width scanner
        Scanner radiusIn = new Scanner( System.in ); //declaring an instance of the radius scanner
        System.out.print("Please input the type of area you are trying to calculate: ");  //Prompting user to enter a shape
        String userShape = shape.nextLine(); //Storing the type of shape
        //Forcing the user to input on of the 3 accepted shapes
        while(!userShape.equals("rectangle")&&!userShape.equals("triangle")&&!userShape.equals("circle")){
            System.out.print("Please input either triangle, rectangle, or circle: ");  //Prompting user to enter a shape
            userShape = shape.nextLine(); 
       }
         
        //checking if the user entered rectangle as the shape
        if (userShape.equals("rectangle")||userShape.equals("Rectangle")){
            
            //Asking for the length of the rectangle
            System.out.print("Please input the length of the rectangle: ");
            while (!lengthIn.hasNextDouble()) { //Forcing user to enter a double value
                lengthIn.next(); 
                System.out.print("Error: Please enter a double value: "); 
        }
            length1 = lengthIn.nextDouble(); //Storing the accepted Double value for length
            
            //Asking for the width of the rectangle
            System.out.print("Please input the width of the rectangle: ");
            while (!widthIn.hasNextDouble()) { //forcing user to enter a double value
                widthIn.next(); 
                System.out.print("Error: Please enter a double value: "); 
        }
            width1 = widthIn.nextDouble(); //Storing the accepted Double value for width
            double rectangleArea = rectArea( length1, width1); //Calling the method rectArea
            System.out.println("The area of the rectangle is: " +rectangleArea); //printing the area of the rectangle
        }
        
       
       
       
        //Checking to see if user entered triangle as the shape
        if (userShape.equals("triangle")||userShape.equals("Triangle")){
            
            //asking for the base of the triangle
            System.out.print("Please input the length of the base of the triangle: ");
            while (!baseIn.hasNextDouble()) { //forcing user to enter a double value
                baseIn.next(); 
                System.out.print("Error: Please enter a double value: "); 
        }
            base1 = baseIn.nextDouble(); //Storing the accepted Double value for length of base
            
            //asking for height of the triangle
            System.out.print("Please input the height of the triangle: ");
            while (!heightIn.hasNextDouble()) { //forcing user to enter a double value
                heightIn.next(); 
                System.out.print("Error: Please enter a double value: "); 
        }
            height1 = heightIn.nextDouble(); //Storing the accepted Double value for height
            double triangleArea = triArea( base1, height1);//Calling the method triArea and calculating area of the triangle
            System.out.println("The area of the triangle is: " +triangleArea); //printing the area of the triangle
        }
        
        
        
        
        
        //Checking to see if user entered circle as the shape
        if (userShape.equals("circle")||userShape.equals("Circle")){
            System.out.print("Please input the length of the radius of the circle: "); //Asking for the radius of the circle
            while (!radiusIn.hasNextDouble()) { //fprcing the user to enter a double value
                radiusIn.next(); 
                System.out.print("Error: Please enter a double value: "); 
        }
            radius1 = radiusIn.nextDouble(); //Storing the accepted Double value for radius
            double radiusArea = circArea( radius1 ); //calling the method circArea and calculating the area of the circle
            System.out.println("The area of the circle is: " +radiusArea); // Printing the area of the circle
        }
        
  
     
        }
}