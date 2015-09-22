//Alec Tilley
//Cse002
//09-15-15
//hw03
//Program #2
//This program will calculate the volume and surface area of a block based on user inputs
//
//Import the Scanner
import java.util.Scanner;
//Create the class
public class Block{
    // add a main method
    public static void main(String[] args) {
    //Declaring an instance of the scanner
    Scanner myScanner = new Scanner( System.in );
    //Accepting User values
    System.out.print("Enter the length of the block: ");
    double blockLength = myScanner.nextDouble();
    System.out.print("Enter the width of the block: " );
    double blockWidth = myScanner.nextDouble();
    System.out.print("Enter the height of the block: " );
    double blockHeight = myScanner.nextDouble();
    //Declaring the variables to be used in calculations
    double blockVolume;
    double blockSurfaceArea;
    //Calculating volume and surface area
    blockVolume = blockLength * blockWidth * blockHeight;
    blockSurfaceArea = ((blockLength * blockWidth )* 2) + ((blockHeight *blockWidth)*2) + ((blockHeight*blockLength)*2);
    //Printing out the answers
    System.out.println("The volume of the block of dimensions" + " " + blockLength + " x " + blockWidth + " x " + blockHeight + " is: " + blockVolume);
    System.out.println("The surface area of the block is " + blockSurfaceArea);
    }
}