//Alec Tilley
//09-18-15
//lab04
//This program will pick a random card out of the deck
//
//Import the random util
import java.util.Random;
//Create the class
public class CardGenerator{
    // add a main method
    public static void main(String[] args) {
        //Chosing a random suit
        int suit = (int) (Math.random() * 4);
        //Chosing  random Card
        int number = (int) (Math.random() * 14);
        //Declaring suitName
        String suitName="";
        //Changes suit from number to String
        if (suit==0){
            suitName="Diamonds";
        }
        else if (suit == 1){
            suitName="Clubs";
        }
        else if (suit == 2){
            suitName="Hearts";
        }
        else if (suit ==3){
            suitName="Spades";
        }
        switch( number ){
            case 1:
               System.out.println("You picked an Ace of " + suitName);
               break;
            case 11:
                System.out.println("You picked a Jack of " + suitName);
                break;
            case 12:
                System.out.println("You picked a Queen of "+ suitName);
                break;
            case 13:
                System.out.println("You Picked a King of " + suitName);
                break;
            default:
                System.out.println("You picked a " + number + " of " + suitName);
                break;
       }
    }
}