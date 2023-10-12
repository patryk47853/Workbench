import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindSumPairs {
    public static void main(String[] args) {
        int[] ans = {1, 3, 5, 3};
        int[] ans1 = {4, 3, 5, 1};
        int[] ans2 = {5, 1, 4, 3};
        System.out.println(Arrays.toString(findSumPairs(8, ans))); // [1,2]
        System.out.println(Arrays.toString(findSumPairs(2, ans1))); // []
        System.out.println(Arrays.toString(findSumPairs(8, ans2))); // [0,3]
        System.out.println(Arrays.toString(findSumPairsFaster(8, ans))); // [1,2]
        System.out.println(Arrays.toString(findSumPairsFaster(2, ans1))); // []
        System.out.println(Arrays.toString(findSumPairsFaster(8, ans2))); // [0,3]
    }

    public static int[] findSumPairs(int target, int[] numbers) {
        if(numbers.length <= 1) return new int[0];

        for(int i = 0; i < numbers.length - 1; i++) {
            for(int j = i +1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) return new int[] {i, j};
            }
        }

        return new int[0];
    }

    public static int[] findSumPairsFaster(int target, int[] numbers) {
        if(numbers.length <= 1) return new int[0];

        Map<Integer, Integer> elementToIndex = new HashMap<>();

        for(int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];

            if(elementToIndex.containsKey(complement)) {
                int complementIndex = elementToIndex.get(complement);
                return new int[]{complementIndex, i};
            }

            elementToIndex.put(numbers[i], i);
        }

        return new int[0];
    }
}