public class PigLatin {
    public static String pigIt(String str) {
         String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            
            // Check if the word contains only alphabetic characters
            if (word.matches("[a-zA-Z]+")) {
                char firstLetter = word.charAt(0);
                words[i] = word.substring(1) + firstLetter + "ay";
            }
        }

        return String.join(" ", words);
    }
}
