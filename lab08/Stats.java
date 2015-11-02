//Alec Tilley
//Lab 08
//This program will run a different method based on user input
//
//Import the Scanner
import java.util.Scanner;
//Create a public class
public class Stats{
    public static double mean(double num1, double num2, double num3, double num4, double num5){ //Creating a method to calculate the mean of the 5 values
        return (num1 + num2 + num3 + num4 + num5)/5; //Returning the calculation
    }
    public static double median(double numb1, double numb2, double numb3, double numb4, double numb5){ //creating a method to calculate the median of the 5 values
        return numb2; //Returning the calculation
    }
    public static void printout(double printmean, double printmedian){ //Creating a method to print the mean and median
        System.out.println("The mean of your values is: " + printmean);  //Printing the mean
        System.out.println("The median of your values is: " + printmedian); //Printing the median
    }
    public static void main(String[] args){ //Creating a main method
        Scanner scan1 = new Scanner( System.in );  //Declaring an instance of the scanner
        Scanner scan2 = new Scanner( System.in ); //Declaring an instance of the scanner
        Scanner scan3 = new Scanner( System.in ); //declaring an instance of the scanner
        Scanner scan4 = new Scanner( System.in ); //Declaring an instance of the scanner
        Scanner scan5 = new Scanner( System.in ); //Declaring an instance of the scanner
        System.out.print("Please input your first variable: ");  //Prompting user to enter a shape
        double input1 = scan1.nextDouble(); //Storing the first variable
        System.out.print("Please input a number bigger than " + input1 + ": "); //asking for the second variable
        double input2 = scan2.nextDouble(); //Storing the value
        while(input1>=input2){//checking to make sure the numbers are ascending
            System.out.print("Please input a number bigger than " + input1 + ": ");
            input2=scan2.nextDouble();
        }
        System.out.print("Please input a number bigger than " + input2 + ": ");//asking for the third variable
        double input3 = scan3.nextDouble();//Storing the value
        while(input2>=input3){//Checking if numbers are ascending
            System.out.print("Plese enter a number bigger than " + input2 + ": ");
            input3=scan3.nextDouble();
        }
        System.out.print("Please input a number bigger than " + input3 + ": "); //Asking for the 4th variable
        double input4 = scan4.nextDouble();// Stoering the value
        while(input3>=input4){ //Checking if numbers are ascending
            System.out.print("Plese enter a number bigger than " + input3 + ": ");
            input4=scan4.nextDouble();
        }
        System.out.print("Please input a number bigger than " + input4 + ": "); //Asking for the 5th number
        double input5 = scan5.nextDouble(); //Storing the value
        while(input4>=input5){ //Checking if numbers are ascending
            System.out.print("Plese enter a number bigger than " + input4 + ": ");
            input5=scan5.nextDouble();
        }
        
        double meanout = mean(input1, input2, input3, input4, input5); //calling the mean method
        double medianout = input3; //Calling the median method
        printout(meanout, medianout); //Callint the printout method
    }
}