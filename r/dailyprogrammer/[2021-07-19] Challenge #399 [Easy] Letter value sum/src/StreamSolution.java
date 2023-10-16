import java.util.Arrays;

public class StreamSolution {
    public static void main(String[] args) {
        System.out.println(letterSum("excellent")); // 100
        System.out.println(letterSum("")); // 0
        System.out.println(letterSum("a")); // 1
        System.out.println(letterSum("z")); // 26
        System.out.println(letterSum("cab")); // 6
        System.out.println(letterSum("microspectrophotometries")); // 317
    }

    private static int letterSum(String lowercase) {
        return lowercase.chars()
                .map(c -> c - 'a' + 1)
                .sum();
    }
}
