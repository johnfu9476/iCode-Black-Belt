// 1. import scanner tools
import java.util.Scanner;

public class Input {
    public static void main(String[] arg){
        // 2. Create Scanner Objects
        Scanner myScanner = new Scanner(System.in);

        // 3. Use scanner object
        String name = myScanner.nextLine();
        int age = myScanner.nextInt();
        float distance = myScanner.nextFloat();

        System.out.println(name + " was " + String.valueOf(age) + " when he drove " + String.valueOf(distance) + " across the US");

        // 4. Close the scanner
        myScanner.close();
    }
}
