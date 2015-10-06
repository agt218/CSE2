//Alec Tilley
//10-02-15
//lab06
//This program will print out certain loops
//
//Import the random util
import java.util.Random;
//define a class
public class GettingLoopy{
    //add a main method
    public static void main(String[] args) {
        //Declare global variables
        int sevenLoopOne = 1;
        int Prime=11;
        //Step one
        System.out.println("Step 1:");
        //Printing numbers 1-6
        while(sevenLoopOne<7){
            System.out.print(sevenLoopOne);
            sevenLoopOne=sevenLoopOne +1;
        }
        //Printing multiple 7's
        while(sevenLoopOne<14){
            System.out.print('7');
            sevenLoopOne= sevenLoopOne + 1;
        }
        //Step Two
        //Organizing the Printed Output
        System.out.println("");
        System.out.println("Step 2:");
        System.out.print("While Loop: ");
        //Constructing the While loop and testing for primes \
        while(Prime>=10&&Prime<=100){
            if (Prime%2>0){
                if(Prime%3>0){
                    if(Prime%5>0){
                        if(Prime%7>0){
                            System.out.print(Prime+ " ");
                            Prime=Prime+1;
                        }
                        else{
                            Prime=Prime+1;
                        }
                    }
                    else{
                        Prime=Prime +1;
                    }
                }
                else{
                    Prime=Prime+1;
                }
            }
            else{
                Prime=Prime+1;
            }
        }
         //Organizing the Printed Output
         System.out.println("");
         System.out.print("For Loop: ");
         //Constructing the for loop and testing for primes
         for (Prime = 10; Prime < 100; Prime++) {
             if (Prime%2>0){
                if(Prime%3>0){
                    if(Prime%5>0){
                        if(Prime%7>0){
                            System.out.print(Prime+ " ");
                        }
                        else{
                            Prime=Prime;
                        }
                    }
                    else{
                        Prime=Prime;
                    }
                }
                else{
                    Prime=Prime;
                }
            }
            else{
                Prime=Prime;
            }
         }
         //Organizing the Printed Output
         System.out.println("");
         System.out.print("Do-While Loop :");
         //Constructing the Do-While loop
         int B=10;
         do{
             if (B%2>0){
                if(B%3>0){
                    if(B%5>0){
                        if(B%7>0){
                            System.out.print(B+ " ");
                            B=B+1;
                        }
                        else{
                            B=B+1;
                        }
                    }
                    else{
                        B=B +1;
                    }
                }
                else{
                    B=B+1;
                }
            }
            else{
                B=B+1;
            }
         } while(B<=100);
         //Organizing Printed Output
         System.out.println("");
         System.out.println("Step 3: ");
         int Symbol = (int) (Math.random() * 201);
         int counter=1;
         System.out.println(Symbol);
         int K=0;
         int W=20;
       while(K<Symbol){
          System.out.print("<3");
          K++;
          if(K%W==0){
              System.out.println("");
          }
      }
      System.out.println("");
        
    }
}