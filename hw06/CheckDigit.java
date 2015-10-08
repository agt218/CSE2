//Alec Tilley
//10-07-15
//Hw06
//This program will check to see if an isbn is valid or not
//
//Import the Scanner
import java.util.Scanner;
//Define a class
public class CheckDigit{
    //Add a Main Method
     public static void main(String[] args) {
     //Declaring an instance of the Scanner
    Scanner scan = new Scanner( System.in );
    System.out.print("Enter a 10 digit ISBN: ");
    //asking for the inputted isbn\
   
     while (!scan.hasNextDouble()) {        
    scan.next(); 
      System.out.print("Enter an integer 10 digit ISBN: "); 
}
    double isbn = scan.nextDouble();

        //Seperating the digits of the isbn
        int d1=(int)(isbn/1000000000);
        int d2=(int)((isbn/100000000)-(10*d1));
        int d3=(int)((isbn/10000000)-(100*d1)-(10*d2));
        int d4=(int)((isbn/1000000)-(1000*d1)-(100*d2)-(10*d3));
        int d5=(int)((isbn/100000)-(10000*d1)-(1000*d2)-(100*d3)-(10*d4));
        int d6=(int)((isbn/10000)-(100000*d1)-(10000*d2)-(1000*d3)-(100*d4)-(10*d5));
        int d7=(int)((isbn/1000)-(1000000*d1)-(100000*d2)-(10000*d3)-(1000*d4)-(100*d5)-(10*d6));
        int d8=(int)((isbn/100)-(10000000*d1)-(1000000*d2)-(100000*d3)-(10000*d4)-(1000*d5)-(100*d6)-(10*d7));
        int d9=(int)((isbn/10)-(100000000*d1)-(10000000*d2)-(1000000*d3)-(100000*d4)-(10000*d5)-(1000*d6)-(100*d7)-(10*d8));
        double d10=(double)((isbn/10)-(100000000*d1)-(10000000*d2)-(1000000*d3)-(100000*d4)-(10000*d5)-(1000*d6)-(100*d7)-(10*d8));
        int dx=(int)((d10*10)-(d9*10));
        //summing the digits
        int isbnc=(10*d1)+(9*d2)+(8*d3)+(7*d4)+(6*d5)+(5*d6)+(4*d7)+(3*d8)+(2*d9);
        //correcting last digit
        if((d10-d9)-(.1*dx)>=.09 && (d10-d9)-(.1*dx)<=.1){
            dx++;
        }
        int nc=0;
        //Checking for valid ISBN
        if((isbnc%11)==dx){
            System.out.println("This is a valid ISBN");
        }
        //if the check digit is in correct starts if loop
        if((isbnc%11)!=dx){
            //Checking if check digit is X
             if((isbnc%11)==10){
             System.out.println("This is not a valid ISBN, Check digit should be X");
            }
            //Finding the correct check digit
            nc=(isbnc%11);
            if((isbnc%11)!=10){
            System.out.println("This is not a valid ISBN, Check digit should be:" + nc);
            }
        }
     }
}