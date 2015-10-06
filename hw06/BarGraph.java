//Alec Tilley
//10-06-15
//Hw06
//This program will pick a random card out of the deck
//
//Import the random util
import java.util.Random;
//Import the Scanner
import java.util.Scanner;
//define a class
public class BarGraph{
    //add a main method
    public static void main(String[] args) {
        //Asking for inputs for the 7 days
        Scanner myScanner = new Scanner( System.in );
        System.out.print("Enter the expenditures for Monday in the form xx.xx: ");
        double Monday = myScanner.nextDouble();
        System.out.print("Enter the expenditures for Tuesday in the form xx.xx: ");
        double Tuesday = myScanner.nextDouble();
        System.out.print("Enter the expenditures for Wednesday in the form xx.xx: ");
        double Wednesday = myScanner.nextDouble();
        System.out.print("Enter the expenditures for Thursday in the form xx.xx: ");
        double Thursday = myScanner.nextDouble();
        System.out.print("Enter the expenditures for Friday in the form xx.xx: ");
        double Friday = myScanner.nextDouble();
        System.out.print("Enter the expenditures for Saturday in the form xx.xx: ");
        double Saturday = myScanner.nextDouble();
        System.out.print("Enter the expenditures for Sunday in the form xx.xx: ");
        double Sunday = myScanner.nextDouble();
        //Turning and rounding Expenditures into Ints
        int d1=(int) Monday;
        int d2=(int) Tuesday;
        int d3=(int) Wednesday;
        int d4=(int) Thursday;
        int d5=(int) Friday;
        int d6=(int) Saturday;
        int d7=(int) Sunday;
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        int e=0;
        int f=0;
        int g=0;
        //Correcting the rounding
        if((Monday-d1)>.5){
            d1++;
        }
         if((Tuesday-d2)>.5){
            d2++;
        }
         if((Wednesday-d3)>.5){
            d3++;
        }
         if((Thursday-d4)>.5){
            d4++;
        }
         if((Friday-d5)>.5){
            d5++;
        }
         if((Saturday-d6)>.5){
            d6++;
        }
         if((Sunday-d7)>.5){
            d7++;
        }
        //Making the Chart
        System.out.printf("Expenses for Monday:     $ %.2f",  Monday);
        System.out.println("");
        System.out.printf("Expenses for Tuesday:    $ %.2f",  Tuesday);
        System.out.println("");
        System.out.printf("Expenses for Wednesday:  $ %.2f",  Wednesday);
        System.out.println("");
        System.out.printf("Expenses for Thursday:   $ %.2f",  Thursday);
        System.out.println("");
        System.out.printf("Expenses for Friday:     $ %.2f",  Friday);
        System.out.println("");
        System.out.printf("Expenses for Saturday:   $ %.2f",  Saturday);
        System.out.println("");
        System.out.printf("Expenses for Sunday:     $ %.2f",  Sunday);
        System.out.println("");
        System.out.println("");
        //Creating the Bar Graph
        System.out.print("Mon:     ");
        while(a<d1){
            System.out.print("*");
            a++;
        }
        System.out.println("");
        System.out.print("Tues:    ");
        while(b<d2){
            System.out.print("*");
            b++;
        }
        System.out.println("");
        System.out.print("Wed:     ");
        while(c<d3){
            System.out.print("*");
            c++;
        }
        System.out.println("");
        System.out.print("Thurs:   ");
        while(d<d4){
            System.out.print("*");
            d++;
        }
        System.out.println("");
        System.out.print("Fri:     ");
        while(e<d5){
            System.out.print("*");
            e++;
        }
        System.out.println("");
        System.out.print("Sat:     ");
        while(f<d6){
            System.out.print("*");
            f++;
        }System.out.println("");
        System.out.print("Sun:     ");
        while(g<d7){
            System.out.print("*");
            g++;
        }
        System.out.println("");
        //Calculating Weekly average and printing it
        double average = (Monday+Tuesday+Wednesday+Thursday+Friday+Saturday+Sunday)/7;
        System.out.printf("Your average weekly expenses are:   $ %.2f", average);
        System.out.println("");
        //Calculating 4 year average and printing it
        double Fouryear=average;
        int week=1;
        double newpercent=0;
        double Nextweek= average;
        while(week>=1&&week<=208){
            double randompercent = (double) (Math.random() * 40);
            if(randompercent<=20){
                newpercent=1-(randompercent/100);
            }
            if(randompercent>20&&randompercent<=40){
                newpercent=1+((randompercent-20)/100);
            }
            Nextweek=(Nextweek*newpercent);
            Fouryear=Fouryear+Nextweek;
            week++;
        }
        System.out.printf("Estimated Expenses for 4 years:   $ %.2f", Fouryear);
        System.out.println("");
    }
}