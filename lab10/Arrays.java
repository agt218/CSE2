//Alec Tilley
//Lab 010
//This program will determine the midterm grades of 5-10 students
//
//Import the Scanner
import java.util.Scanner;
//Import the random util
import java.util.Random;
//Create a public class
public class Arrays{
    public static void main(String [] args){ //Create a main method
    //Declaring the scanner
    Scanner student = new Scanner( System.in );
        //Chosing a random number of students between 5 & 10
        int ns = (int) (Math.random()*6)+5; //calculating a random number of students between 5 & 10
        String [] students = new String [ns]; //Allocating the correct size for the stuednts array
        int[] grades = new int [ns]; //Allocating the correct size for the grades array
        System.out.println("Plase enter the names of " + ns + " students: "); //Opening statement asking for correct number of student names
        for(int i=0; i<ns; i++){
        students[i]=student.nextLine(); //Forcing user to input the correct number of student names into the array
        }
        for(int j=0; j<ns; j++){
            grades[j]= (int) (Math.random()*101); //Filling the array with the correct number of random grades
        }
        System.out.println("Here are the midterm grades of the " + ns + " students listed above:");
        for(int g=0; g<ns; g++){
            System.out.println(students[g] + " : " + grades[g]); //Printing out the students and grades array
        }
}
}