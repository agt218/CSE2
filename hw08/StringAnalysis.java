//Alec Tilley
//10-20-15
//CSE2
//hw08
//This program will Calculate the area of 3 shapes based on the user inputted values
//import the scanner
import java.util.Scanner;
//Create a public class
public class StringAnalysis{
    //Create a classs that will analyze a level one string
    public static void stringonly(String mop){
        int length = mop.length(); //Finding the length of the inputted string
        int i = 0;
        int letters1=0;
        int numbers1=0;
       
        while(i<length){
          
            if(mop.charAt(i)>'a' && mop.charAt(i)<'z'){ //Checking to see if character is a letter
                letters1++; //Increasing the letter counter
                i++; //Moving on to analyze the next character
            }
            else{ //Checking if character is a number
                numbers1++; //Increasing the number counter
                i++; //moving on to analyze the next letter
            }
          
        }
        System.out.println("Your string contained "+ letters1 + " letters and " + numbers1 + " numbers"); //Printing out how many letters and numbers were in the string
        
        
    }
    //Creating a class that will analyze a level two string
    public static void stringand(String dad, int mom){
        int length2=dad.length(); //Finding the length of an inputted string
        int length3=0;
        //Checking to see if the entered variable is bigger than the number of characters in the string
        if(length2<mom){
            length3=length2; //if it is, the program will only analyze the number of characters in the whole string
        }
        if(length2>mom){
            length3=mom; //if it is not, the program will analyze the inputted number of characters
        }
        int o = 0;
        int letters2 = 0;
        int numbers2=0;
        
        while(o<length3){
            if(dad.charAt(o)>'a' && dad.charAt(o)<'z'){ //Checking to see if the character is a letter
                letters2 ++; //increasing the letter counter
                o++; //moving on to analyze the next character
            }
            else{//checking to see if the character is a number
                numbers2++; //increasing the numbers counter variable
                o++ ;// moving on to analyze the next character
            }
        }
         System.out.println("Your string contained "+ letters2 + " letters and " + numbers2 + " numbers"); //Printing out the number of letters and numbers in the string
        
    }
    
  public static void main(String[] args){ //adding a main method   //adding the main method
        //Declaring instances of the scanners
       Scanner select = new Scanner( System.in );
       Scanner string1 = new Scanner(System.in);
       Scanner string2 = new Scanner(System.in);
       Scanner int1 = new Scanner(System.in);
       //Printing out a welcome message
       System.out.println("Welcome to the new high-tech String analyzer");
       System.out.println("This will analyze a string to see if it contains letters");
       System.out.println("Level one analyzer: Scans an entire string entered by the user");
       System.out.println("Level two analyzer: Scans specified number of characters in a string");
       System.out.print("Please enter 'one' for a level one scanner or 'two' for a level two scanner: ");
       String level = select.nextLine(); //Prompting user to enter the level of the analyzzer
        while(!level.equals("one")&&!level.equals("two")){//forcing user to match suggested input
            System.out.print("Error: Please input either one or two: ");  //Prompting user to enter one or two
            level = select.nextLine(); 
       }
       if (level.equals("one")){ //checking if the analyzer is a level one
           System.out.print("Please enter a string to be analyzed: ");
           String stringone = string1.nextLine(); //storing the string to be analyzed
           stringonly(stringone); //calling the method and running it with the inputted string
           
       }
       if(level.equals("two")){ //checking if analyzer is a level two
           System.out.print("Please enter a string to be analyzed: ");
           String stringtwo = string2.nextLine(); //Storing the inputted string value
           System.out.print("Please enter the number of characters you want analyzed: ");
          int intone=0;
           while (!int1.hasNextInt()) { //Forcing user to enter an integer value
                int1.next(); 
                System.out.print("Error: Please enter an integer value: ");
               
        }
        intone = int1.nextInt();
            
            stringand(stringtwo, intone); //calling the method with the user inputted string and number of characters
    }
}
}