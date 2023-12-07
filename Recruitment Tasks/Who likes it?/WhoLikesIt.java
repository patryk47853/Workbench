public class WhoLikesIt {
    public static String whoLikesIt(String... names) {
        int size = names.length;

        return switch (size) {
            case 0 -> "no one likes this";
            case 1 -> String.format("%s likes this", names[0]);
            case 2 -> String.format("%s and %s like this", names[0], names[1]);
            case 3 -> String.format("%s, %s and %s like this", names[0], names[1], names[2]);
            default -> String.format("%s and %d others like this",
                    String.join(", ", names[0], names[1]), size - 2);
        };
    }
}
