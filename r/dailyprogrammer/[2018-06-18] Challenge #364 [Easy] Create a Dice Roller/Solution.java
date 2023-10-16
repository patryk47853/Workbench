import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        System.out.println(roll("3d3"));
    }

    private static int roll(String input) {
        Random random = new Random();
        int ans = 0;

        String[] parts = input.split("d");
        int rolls = Integer.parseInt(parts[0]);
        int sides = Integer.parseInt(parts[1]);

        for(int i = 0; i < sides; i++) {
            ans += random.nextInt(rolls);
        }

        return ans;
    }
}
