//Alec Tilley
//Cse002
//09-15-15
//hw03
//Program #1
//This program will calculate tip data for a dinner bill
//
//Import the Scanner
import java.util.Scanner;
//Create the class
public class Timer{
    // add a main method
    public static void main(String[] args) {
    //Declaring an instance of the Scanner
    Scanner myScanner = new Scanner( System.in );
    //Accepting user values
    System.out.print("Enter the current time in the form HHMM: ");
    double currentTime = myScanner.nextDouble();
    System.out.print("Enter the time that dinner starts in the form HHMM: " );
    double dinnerTime = myScanner.nextDouble();
    //Declaring the variables to be used in calculations
    int hours;
    int minutes;
    //Making the calculations
    double timeLeft = dinnerTime-currentTime;
    double timeLeft2 = timeLeft/100;
    hours=(int)(timeLeft2); //Calculates number of hours until dinner
    minutes=(int)(timeLeft2*100) %100;
    //Printing the results
    System.out.println(timeLeft2);
    System.out.println(hours);
    System.out.println(minutes);
    System.out.println("You have " + hours +"hours and " + minutes +"minutes until dinner.");
    }
}