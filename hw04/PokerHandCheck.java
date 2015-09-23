//Alec Tilley
//09-22-15
//hw04
//This program will pick 5 cards from a deck and analyze them
//
//Import the random util
import java.util.Random;
//Create the class
public class PokerHandCheck{
    // add a main method
    public static void main(String[] args) {
        //Chosing the suits of the 5 cards
        int suit1 = (int) (Math.random() * 4);
        int suit2 = (int) (Math.random() * 4);
        int suit3 = (int) (Math.random() * 4);
        int suit4 = (int) (Math.random() * 4);
        int suit5 = (int) (Math.random() * 4);
        //Chosing  random Card
        int number1 = (int) (Math.random() * 14);
        int number2 = (int) (Math.random() * 14);
        int number3 = (int) (Math.random() * 14);
        int number4 = (int) (Math.random() * 14);
        int number5 = (int) (Math.random() * 14);
        //Declaring suitName
        String suitName1="";
        String suitName2="";
        String suitName3="";
        String suitName4="";
        String suitName5="";
        int kind =0;
        int pair  =0;
        //Changes suit name for the 1st card
        //
        //
        if (suit1==0){
            suitName1="Diamonds";
        }
        else if (suit1 == 1){
            suitName1="Clubs";
        }
        else if (suit1 == 2){
            suitName1="Hearts";
        }
        else if (suit1 ==3){
            suitName1="Spades";
        }
        //Changes suit name for the 2nd card
        //
        //
        if (suit2==0){
            suitName2="Diamonds";
        }
        else if (suit2 == 1){
            suitName2="Clubs";
        }
        else if (suit2 == 2){
            suitName2="Hearts";
        }
        else if (suit2 ==3){
            suitName2="Spades";
        }
        //Changes suit name for the 3rd Card
        //
        //
         if (suit3==0){
            suitName3="Diamonds";
        }
        else if (suit3 == 1){
            suitName3="Clubs";
        }
        else if (suit3 == 2){
            suitName3="Hearts";
        }
        else if (suit3 ==3){
            suitName3="Spades";
        }
        //Changes suit name for 4th card
        //
        //
        if (suit4==0){
            suitName4="Diamonds";
        }
        else if (suit4 == 1){
            suitName4="Clubs";
        }
        else if (suit4 == 2){
            suitName4="Hearts";
        }
        else if (suit4 ==3){
            suitName4="Spades";
        }
        //Changes suit name for 5th card
        //
        //
          if (suit5==0){
            suitName5="Diamonds";
        }
        else if (suit5 == 1){
            suitName5="Clubs";
        }
        else if (suit5 == 2){
            suitName5="Hearts";
        }
        else if (suit5 ==3){
            suitName5="Spades";
        }
        //Prints out what the first Card is
        //
        //
        switch( number1 ){
            case 1:
               System.out.println("Your first card is an Ace of " + suitName1);
               break;
            case 11:
                System.out.println("Your first card is a Jack of " + suitName1);
                break;
            case 12:
                System.out.println("Your first card is a Queen of "+ suitName1);
                break;
            case 13:
                System.out.println("Your first card is a King of " + suitName1);
                break;
            default:
                System.out.println("Your first card is " + number1 + " of " + suitName1);
                break;
       }
        //Prints out what the second card is
        //
        //
        switch( number2 ){
            case 1:
               System.out.println("Your second card is an Ace of " + suitName2);
               break;
            case 11:
                System.out.println("Your second card is a Jack of " + suitName2);
                break;
            case 12:
                System.out.println("Your second card is a Queen of "+ suitName2);
                break;
            case 13:
                System.out.println("Your second card is a King of " + suitName2);
                break;
            default:
                System.out.println("Your second card is a "  + number2 + " of " + suitName2);
                break;
       }
         //Prints out what the third card is
         //
         //
         switch( number3 ){
            case 1:
               System.out.println("Your third card is an Ace of " + suitName3);
               break;
            case 11:
                System.out.println("Your third card is a Jack of " + suitName3);
                break;
            case 12:
                System.out.println("Your third card is a Queen of "+ suitName3);
                break;
            case 13:
                System.out.println("Your third card is a King of " + suitName3);
                break;
            default:
                System.out.println("Your third card is a "  + number3 + " of " + suitName3);
                break;
       }
        //Prints out what the fourth card is
         //
         //
         switch( number4 ){
            case 1:
               System.out.println("Your fourth card is an Ace of " + suitName4);
               break;
            case 11:
                System.out.println("Your fourth card is a Jack of " + suitName4);
                break;
            case 12:
                System.out.println("Your fourth card is a Queen of "+ suitName4);
                break;
            case 13:
                System.out.println("Your fourth card is a King of " + suitName4);
                break;
            default:
                System.out.println("Your fourth card is a "  + number4 + " of " + suitName4);
                break;
       }
         //Prints out what the fifth card is
         //
         //
         switch( number5 ){
            case 1:
               System.out.println("Your fifth card is an Ace of " + suitName5);
               break;
            case 11:
                System.out.println("Your fifth card is a Jack of " + suitName5);
                break;
            case 12:
                System.out.println("Your fifth card is a Queen of "+ suitName5);
                break;
            case 13:
                System.out.println("Your fifth card is a King of " + suitName5);
                break;
            default:
                System.out.println("Your fifth card is a "  + number5 + " of " + suitName5);
                break;
       }
       //Checking for 3 of a kind
       //
       //
        if(number1==number2 & number3==number1){
          kind=1;
       }
        else if (number1==number2 & number4==number1){
          kind=1;
       }
        else if (number1==number2 & number5==number1){
          kind=1;
       }
        else if (number1==number3 & number4==number1){
          kind=1;
       }
        else if (number1==number3 & number5==number1){
          kind=1;
       }
        else if (number2==number3 & number4==number2){
          kind=1;
       }
        else if (number2==number3 & number5==number2){
          kind=1;
       }
        else if (number3==number4 & number5==number3){
          kind=1;
       }

     //Checking for pairs
     //
     //
     if (number1==number2){
         pair=pair+1;
     }
     else if (number1==number3){
         pair=pair+1;
     }
     else if (number1==number4){
         pair=pair+1;
     }
     else if (number1==number5){
         pair=pair+1;
     } 
     else if (number2==number3){
         pair=pair+1;
     } 
     else if (number2==number4){
         pair=pair+1;
     }
     else if (number2==number5){
         pair=pair+1;
     } 
     else if (number3==number4){
         pair=pair+1;
     } 
     else if (number3==number5){
         pair=pair+1;
     } 
     else if (number4==number5){
         pair=pair+1;
     } 
     if(pair>=1){
      System.out.println( "You have " + pair + " pairs" );
     }
    if(kind == 1){
        System.out.println("You have three of a kind");
    }
    if(kind == 0 & pair==0){
        System.out.println("You have a high card hand");
    }
    }
}