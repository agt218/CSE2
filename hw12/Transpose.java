//Alec Tilley
//11-17-15
//hw04
//This program will pick 5 cards from a deck and analyze them
//
//Import the random util
import java.util.Random;
//import the scanner
import java.util.Scanner;
//Create the class
public class Transpose{
    public static void randomMatrix (int lengt, int widt) { //Adding a method to create a random array
         int array1[][] = new int[lengt][widt];
        for (int r=0; r<lengt;r++){
            for (int c=0; c<widt; c++){
                array1[r][c]=((int) (Math.random() * 20))-10;
                System.out.print(array1[r][c]+ " ");
            }
             System.out.print("\n");
        }

    }


        
    

    // add a main method
    public static void main(String[] args) {
    Scanner scan = new Scanner( System.in );  //Declaring an instance of the length scanner
    Scanner scanw = new Scanner( System.in );  //Declaring an instance of the width scanner
    System.out.print("Input your desired length: ");  //Prompting user to enter a length
    //Forcing user to enter an integer value
    while (!scan.hasNextInt()) {
        scan.next(); 
        System.out.print("Error: Please enter an integer value: "); 
        }
    int length = scan.nextInt(); //Storing the accepted integer value for length
    //Forcing user to enter length bigger than zero
    while (length<=0) {
        System.out.print("Error: Please input an integer bigger than zero: "); //Prompting the user to re-enter a smaller value for length
        while (!scan.hasNextInt()) {
        scan.next(); 
        System.out.print("Error: Please enter an INTEGER value bigger than zreo: "); 
        }
        length = scan.nextInt();
    }
    
     System.out.print("Input your desired width: ");  //Prompting user to enter a width
    //Forcing user to enter an integer value
    while (!scanw.hasNextInt()) {
        scanw.next(); 
        System.out.print("Error: Please enter an integer value: "); 
        }
    int width = scanw.nextInt(); //Storing the accepted integer value for width
    //Forcing user to enter length bigger than zero
    while (width<=0) {
        System.out.print("Error: Please input an integer bigger than zero: "); //Prompting the user to re-enter a smaller value for length
        while (!scanw.hasNextInt()) {
        scanw.next(); 
        System.out.print("Error: Please enter an INTEGER value bigger than zreo: "); 
        }
        width = scanw.nextInt();
    }
     
   randomMatrix(length, width);

    }
}