public class Main {
    public static void main(String[] args) {
        System.out.println(stringCompressor("aabbbc"));
    }

    public static String stringCompressor(String input) {
        if (input == null || input.isEmpty()) return input;

        StringBuilder compressed = new StringBuilder();
        char currentChar = input.charAt(0);
        int counter = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == currentChar) {
                counter++;
            } else {
                compressed.append(currentChar);
                compressed.append(counter);
                currentChar = input.charAt(i);
                counter = 1;
            }
        }

        compressed.append(currentChar);
        compressed.append(counter);

        return compressed.toString();
    }
}
