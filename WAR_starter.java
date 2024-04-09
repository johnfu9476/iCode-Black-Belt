import java.util.Random;
import java.util.Scanner;

public class WAR_starter {
    public static void main(String[] args){

        Scanner myObj = new Scanner(System.in);
        String userName;
    
        System.out.println("Enter username"); 
        userName = myObj.nextLine(); 
        System.out.println("hi "+userName);

        // Generation of 2 random cards (1-52)
        Random rand = new Random();
        int computerCARD = rand.nextInt(52);
        int userCARD = rand.nextInt(52); 
        if(computerCARD == 0){
            computerCARD += 1;
        }
        if(userCARD == 0){
            userCARD += 1;
        }

        //YOUR CODE GOES HERE
        char suitForComputer;
        int cardNumberForComputer;

        char suitForUser;
        int cardNumberForUser;

        //Finds suit for computer
        if (computerCARD >= 1 && computerCARD <= 13) {
            suitForComputer = 'C';
        } else if (computerCARD >= 14 && computerCARD <= 26) {
            suitForComputer = 'D';
        } else if (computerCARD >= 27 && computerCARD <= 39) {
            suitForComputer = 'H';
        } else {
            suitForComputer = 'S';
        }
        
        //Finds suit for user
        if (userCARD >= 1 && userCARD <= 13) {
            suitForUser = 'C';
        } else if (userCARD >= 14 && userCARD <= 26) {
            suitForUser = 'D';
        } else if (userCARD >= 27 && userCARD <= 39) {
            suitForUser = 'H';
        } else {
            suitForUser = 'S';
        }

        cardNumberForComputer = computerCARD % 13;
        cardNumberForUser = computerCARD % 13;
        //

        // Final send of 2 cards value (suit + value) to be outputted as ASCII cards
        printAsciiEval("" + suitForComputer + cardNumberForComputer,  "" + suitForUser + cardNumberForUser);
        
        //Determine who wins
        
    }
    public static void printAsciiEval(String computerCard, String userCard) {

        if(computerCard.length() == 2){
            printAscii_2Char_card(computerCard);
        }else {
            printAscii_3Char_card(computerCard);
        }

        System.out.println("------------");
        System.out.println("--COMPUTER--");
        System.out.println("------------");
        System.out.println("-----VS-----");
        System.out.println("------------");
        System.out.println("----USER----");
        System.out.println("------------");

        if(userCard.length() == 2){
            printAscii_2Char_card(userCard);
        }else {
            printAscii_3Char_card(userCard);
        }
    }

    public static void printAscii_2Char_card(String card){
        // Top of the computer card
        System.out.println("┌─────────┐");
        // Upper part of the card with the character
        System.out.println("│" + card + "       │"); // top-left corner of the card
        System.out.println("│         │");
        System.out.println("│         │");
        System.out.println("│    " + card + "   │"); // middle of the card
        System.out.println("│         │");
        System.out.println("│         │");
        // Bottom part of the card with the character mirrored
        System.out.println("│       " + card + "│"); // bottom-right corner of the card
        // Bottom of the card
        System.out.println("└─────────┘");
    }

    public static void printAscii_3Char_card(String card){
        // Top of the computer card
        System.out.println("┌──────────┐");
        // Upper part of the card with the character
        System.out.println("│" + card + "       │"); // top-left corner of the card
        System.out.println("│          │");
        System.out.println("│          │");
        System.out.println("│    " + card + "   │"); // middle of the card
        System.out.println("│          │");
        System.out.println("│          │");
        // Bottom part of the card with the character mirrored
        System.out.println("│       " + card + "│"); // bottom-right corner of the card
        // Bottom of the card
        System.out.println("└──────────┘");
    }
}
