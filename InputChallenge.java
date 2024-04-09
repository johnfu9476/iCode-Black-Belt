import java.util.Scanner;   // Import scanner tool

public class InputChallenge {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);

        System.out.println("What is your FIRST name?");
        String f_name = myScanner.nextLine();

        System.out.println("What is your LAST name?");
        String l_name = myScanner.nextLine();

        System.out.println("What is yoru age?");
        int my_age = myScanner.nextInt();

        // Output the data collected (with processing)
        String new_age = String.valueOf(my_age + 10);

        System.out.println("Hello " + f_name + " " + l_name + ", in ten years you will be " + new_age + " years old.");

        myScanner.close();

    }
}
