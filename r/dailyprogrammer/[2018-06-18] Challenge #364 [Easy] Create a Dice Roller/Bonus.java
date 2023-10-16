import java.util.Random;

public class Bonus {
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
            int roll = random.nextInt(rolls);
            System.out.print(roll + ", ");
            ans += roll;
        }

        System.out.println();
        System.out.println("Total sum: ");

        return ans;
    }
}
