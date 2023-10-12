import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static void main(String[] args) {
        // Test cases
        List<String> test1 = fizzBuzz(15);
        System.out.println("Test 1: " + test1);

        List<String> test2 = fizzBuzz(10);
        System.out.println("Test 2: " + test2);

        List<String> test3 = fizzBuzz(7);
        System.out.println("Test 3: " + test3);
    }


    public static List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if(i % 3 == 0 && i % 5 == 0) ans.add("FizzBuzz");
            else if(i % 3 == 0) ans.add("Fizz");
            else if(i % 5 == 0) ans.add("Buzz");
            else ans.add(String.valueOf(i));
        }

        return ans;
    }
}
