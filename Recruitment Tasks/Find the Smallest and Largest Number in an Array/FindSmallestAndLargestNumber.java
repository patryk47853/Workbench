import java.util.Arrays;

public class FindSmallestAndLargestNumber {
    public static void main(String[] args) {
        int[] testCase = {3, 5, 8, 11, 41, 1, 51, 30, 9, 52};
        System.out.println(Arrays.toString(findSmallestAndLargestNumbers(testCase)));
    }

    public static int[] findSmallestAndLargestNumbers(int[] nums) {
        if(nums.length <= 2) return nums;

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int n : nums) {
            if(n > largest) largest = n;
            if(n < smallest) smallest = n;
        }

        return new int[] {smallest, largest};
    }
}
