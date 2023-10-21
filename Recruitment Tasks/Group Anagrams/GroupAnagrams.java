import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String word : strs) {
            char[] arr = word.toCharArray();

            Arrays.sort(arr);

            String sortedWord = Arrays.toString(arr);

            if(!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }

            map.get(sortedWord).add(word);

        }

        return new ArrayList<>(map.values());
    }

}
