public class PigLatin {
    public static String pigIt(String str) {
        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            char firstLetter = word.charAt(0);
            words[i] = word.substring(1) + firstLetter + "ay";
        }

        return String.join(" ", words);
    }
}
