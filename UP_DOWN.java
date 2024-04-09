public class UP_DOWN {
    public static void main(String[] args){
        // Create a variable (value:5)
        int x = 5;
        System.out.println(x); //5

        // Increase the variable (x) by 1, 3 times
    
        while (x <= 8) {
            x += 1;
            System.out.println(x); 
        }
        // Decrease the variable (x) by 1, 3 times
        x = x - 1;
        System.out.println(x); //7

        x -= 1;
        System.out.println(x); //6

        x--;
        System.out.println(x); //5
    }

}
