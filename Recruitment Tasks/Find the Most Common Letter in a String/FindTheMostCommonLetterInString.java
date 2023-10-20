import java.util.HashMap;
import java.util.Map;

public class FindTheMostCommonLetterInString {

    public static void main(String[] args) {
        String one = "cosmopolitan";
        String two = "career";
        String three = "political";
        System.out.println(findMostCommonLetter(one));
        System.out.println(findMostCommonLetter(two));
        System.out.println(findMostCommonLetter(three));
    }

    public static char findMostCommonLetter(String input) {
        Map<Character, Integer> letters = new HashMap<>();
        char c = ' ';
        int counter = 0;

        for(int i = 0; i < input.length(); i++) {
            letters.put(input.charAt(i), letters.getOrDefault(input.charAt(i), 0) + 1);
            if(letters.get(input.charAt(i)) > counter) {
                c = input.charAt(i);
                counter++;
            }
        }

        return c;
    }


}
