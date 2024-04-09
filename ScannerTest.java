import java.util.Scanner;
public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // variables
        String first;
        String last;
        int age;

        //get values with Scanner
        System.out.print("Enter First Name >>> ");
        first = scanner.nextLine();

        //print line
        System.out.println("Hi my name is " + first + " " + last + ", and I will be " + age + " in ten years!");
        
        scanner.close();
    }
}
//Print First and Last name in one line
//Print age + 10