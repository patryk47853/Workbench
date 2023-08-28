public class Solution {
    public static void main(String[] args) {
        System.out.println(letterSum("excellent")); // 100
        System.out.println(letterSum("")); // 0
        System.out.println(letterSum("a")); // 1
        System.out.println(letterSum("z")); // 26
        System.out.println(letterSum("cab")); // 6
        System.out.println(letterSum("microspectrophotometries")); // 317
    }

    private static int letterSum(String lowercase) {
        int sum = 0;

        for(int i = 0; i < lowercase.length(); i++) {
            int temp = (int) lowercase.charAt(i) - (int) 'a' + 1;
            sum += temp;
        }

        return sum;
    }
}