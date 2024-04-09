import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Sort_Test {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(4);
        numbers.add(2);
        
        Collections.sort(numbers);
        
        System.out.println("Sorted List: " + numbers);

    }
}
