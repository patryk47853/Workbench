import java.util.HashMap;
import java.util.Map;

public class CheckIfTwoStringAreAnagrams {

    public static void main(String[] args) {
        String one = "listen";
        String two = "silent";
        String three = "bad credit";
        String four = "debit card";
        String five = "loco";
        String six = "cola";
        System.out.println(areAnagrams(one, two));
        System.out.println(areAnagrams(three, four));
        System.out.println(areAnagrams(five, six));
    }

    public static boolean areAnagrams(String str1, String str2) {
        if(str1.length() != str2.length()) return false;

        Map<Character, Integer> letters = new HashMap<>();

        for(int i = 0; i < str1.length(); i++) {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);
            letters.put(char1, letters.getOrDefault(char1, 0) + 1);
            letters.put(char2, letters.getOrDefault(char2, 0) - 1);
        }

        for(int count : letters.values()) {
            if(count != 0) return false;
        }

        return true;
    }

}
