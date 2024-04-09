import java.util.Scanner;  // Imports the Scanner tool

public class Basic_Input {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What is your name?");

        String userName = myScanner.nextLine();
        String phrase = myScanner.nextLine();
        System.out.println("Hello " + userName + ", " + phrase);

        myScanner.close();
    }
}
