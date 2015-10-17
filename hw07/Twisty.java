//Alec Tilley
//10-14-15
//HW07
//This program will create a design based on user length and width inputs and will display it on the screen
//
//import the scanner
import java.util.Scanner;
//Define a class
public class Twisty{
    //Add a main method
    public static void main(String[]args){
    Scanner scanl = new Scanner( System.in );  //Declaring an instance of the length scanner
    System.out.print("Input your desired length: ");  //Prompting user to enter a length
    //Forcing user to enter an integer value
    while (!scanl.hasNextInt()) {
        scanl.next(); 
        System.out.print("Error: Please enter an integer value: "); 
        }
    int length = scanl.nextInt(); //Storing the accepted integer value for length
    //Forcing user to enter length value smaller than 80
    while (length>80) {
        System.out.print("Error: Please input an integer smaller than 80: "); //Prompting the user to re-enter a smaller value for length
        while (!scanl.hasNextInt()) {
        scanl.next(); 
        System.out.print("Error: Please enter an INTEGER value smaller than 80: "); 
        }
        length = scanl.nextInt();
    }
   
    Scanner scanw = new Scanner( System.in ); //Declaring an instance of the width scanner
    System.out.print("Input your desired width: "); //Prompting user to enter a width value
    //Forcing the user to enter an integer value
    while (!scanw.hasNextInt()) {
        scanw.next();
        System.out.print("Error: Please enter an integer value: ");
    }
    int width = scanw.nextInt(); //Storing the integer value for width
    //Forcing user to enter a width value that is amaller than the length
    while (width>=length) {
        System.out.print("Error: Please input an integer smaller than the length: "); //Prompting the user to re-enter a smaller value for width
        width = scanw.nextInt();
    }
   //Creating a for loop to control  the amount of rows
    for (int r = 0; r < width; r++) {
    //Creating a for loop to control the amount of columns(The characters on a single line across)
        for (int c = 0; c <= length; c++) {
            
             
            //Creating the pattern of hashtags based on what number the user enters for length and width
            if (r == c) {
                System.out.print("#");
            }
             if (r == c-2*width ||(r+c)==((width)-1)+width) {
                System.out.print("#");
            } 
             if (r == c-4*width ||(r+c)==((width)-1)+3*width) {
                System.out.print("#");
            } 
             if (r == c-6*width ||(r+c)==((width)-1)+5*width) {
                System.out.print("#");
            } 
             if (r == c-8*width ||(r+c)==((width)-1)+7*width) {
                System.out.print("#");
            } 
             if (r == c-10*width ||(r+c)==((width)-1)+9*width) {
                System.out.print("#");
            } 
             if (r == c-12*width ||(r+c)==((width)-1)+11*width) {
                System.out.print("#");
            } 
             if (r == c-14*width ||(r+c)==((width)-1)+13*width) {
                System.out.print("#");
            } 
             if (r == c-16*width ||(r+c)==((width)-1)+15*width) {
                System.out.print("#");
            } 
             if (r == c-18*width ||(r+c)==((width)-1)+17*width) {
                System.out.print("#");
            } 
             if (r == c-20*width ||(r+c)==((width)-1)+19*width) {
                System.out.print("#");
            } 
             if (r == c-22*width ||(r+c)==((width)-1)+21*width) {
                System.out.print("#");
            } 
             if (r == c-24*width ||(r+c)==((width)-1)+23*width) {
                System.out.print("#");
            } 
             if (r == c-26*width ||(r+c)==((width)-1)+25*width) {
                System.out.print("#");
            } 
             if (r == c-28*width ||(r+c)==((width)-1)+27*width) {
                System.out.print("#");
            } 
            //Creating the proper number of spaces in between slashes and hastags
              else {
                System.out.print(" ");
            }
            //Creating the pattern of down slashes based on what the user enter for length and width
              if ((c-(width)==r)) {
                System.out.print("\\");
            } 
             if ((c-(3*width)==r)) {
                System.out.print("\\");
            } 
             if ((c-(5*width)==r)) {
                System.out.print("\\");
            }
             if ((c-(7*width)==r)) {
                System.out.print("\\");
            }
             if ((c-(9*width)==r)) {
                System.out.print("\\");
            }
             if ((c-(11*width)==r)) {
                System.out.print("\\");
            }
             if ((c-(13*width)==r)) {
                System.out.print("\\");
            }
             if ((c-(15*width)==r)) {
                System.out.print("\\");
            }
             if ((c-(17*width)==r)) {
                System.out.print("\\");
            }
             if ((c-(19*width)==r)) {
                System.out.print("\\");
            }
             if ((c-(21*width)==r)) {
                System.out.print("\\");
            }
             if ((c-(23*width)==r)) {
                System.out.print("\\");
            }
             if ((c-(25*width)==r)) {
                System.out.print("\\");
            }
             if ((c-(27*width)==r)) {
                System.out.print("\\");
            }
            //creating the pattern of up-slashes based on what the user enters for length and width
            if ((r+c)==((width)-1)){
                System.out.print("/");
            }
             if ((r+c)==((5*width)-1)){
                System.out.print("/");
            }
             if ((r+c)==((3*width)-1)){
                System.out.print("/");
            }
             if ((r+c)==((7*width)-1)){
                System.out.print("/");
            }
             if ((r+c)==((9*width)-1)){
                System.out.print("/");
            }
             if ((r+c)==((11*width)-1)){
                System.out.print("/");
            }
             if ((r+c)==((13*width)-1)){
                System.out.print("/");
            }
             if ((r+c)==((15*width)-1)){
                System.out.print("/");
            }
             if ((r+c)==((17*width)-1)){
                System.out.print("/");
            }
             if ((r+c)==((19*width)-1)){
                System.out.print("/");
            }
             if ((r+c)==((21*width)-1)){
                System.out.print("/");
            }
             if ((r+c)==((23*width)-1)){
                System.out.print("/");
            }
             if ((r+c)==((25*width)-1)){
                System.out.print("/");
            }
        
            if ((r+c)==((27*width)-1)){
                System.out.print("/");
            }
             if ((r+c)==((29*width)-1)){
                System.out.print("/");
            }
        
        
        
            }
       
    //Moving down to the next line each time a column is completed
        System.out.println();
       
    
  
    }
 
    }
}