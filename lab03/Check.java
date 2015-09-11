//Alec Tilley
//Cse002
//09-11-15
//lab03
//This program will calculate tip data for a dinner bill
//
//Import the Scanner
import java.util.Scanner;
//Create the class
public class Check{
    // add a main method
    public static void main(String[] args) {
        //Declaring an instance of the Scanner
    Scanner myScanner = new Scanner( System.in );
    System.out.print("Enter the original cost of the check in the form xx.xx: ");
    double checkCost = myScanner.nextDouble();
    System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): " ); //Taking input for tip %
    double tipPercent = myScanner.nextDouble();
    tipPercent /= 100; //Turning the percent into a decimal
    System.out.print("Enter the number of people who went out to dinner: "); //Taking input for # of people
    int numPeople = myScanner.nextInt();
    //Declaring variables to be used in arithmeticd
    double totalCost;
    double costPerPerson;
    int dollars;   //whole dollar amount of cost 
    int dimes, pennies; //for storing digits to the right of the decimal point for the cost$ 
    totalCost = checkCost * (1 + tipPercent);
    costPerPerson = totalCost / numPeople;
//get the whole amount, dropping decimal fraction
    dollars=(int)costPerPerson;
//get dimes amount, e.g., 
// (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
//  where the % (mod) operator returns the remainder
//  after the division:   583%100 -> 83, 27%5 -> 2 
    dimes=(int)(costPerPerson * 10) % 10;
    pennies=(int)(costPerPerson * 100) % 10;
    System.out.println("Each person in the group owes $" + dollars + "." + dimes + pennies);



}     
  	} 

