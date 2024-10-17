import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class LetterAnalyzer { // Class name

    public static boolean hasRepeatedLetters(String word) {
        int[] letterCount = new int[26]; // Array for 26 letters

        for (char letter : word.toCharArray()) {
            letterCount[letter - 'a']++; // Increment the counter for the letter
            if (letterCount[letter - 'a'] > 1) {
                return true; // Return true if the letter appears more than once
            }
        }
        return false; // Return false if no letter is repeated
    }

    public static String createRandomWord(String word1, String word2) {
        HashSet<Character> uniqueLetters = new HashSet<>(); // Store unique letters

        // Add unique letters from both words
        for (char letter : word1.toCharArray()) {
            uniqueLetters.add(letter);
        }
        for (char letter : word2.toCharArray()) {
            uniqueLetters.add(letter);
        }

        List<Character> letters = new ArrayList<>(uniqueLetters); // Convert set to list
        Collections.shuffle(letters); // Shuffle the letters randomly

        StringBuilder newWord = new StringBuilder();
        for (char letter : letters) {
            newWord.append(letter); // Append shuffled letters to the new word
        }

        return newWord.toString(); // Return the new word
    }

    public static void findWordsAndCreateText(String[] words) {
        ArrayList<String> foundWords = new ArrayList<>();

        for (String word : words) {
            if (hasRepeatedLetters(word)) {
                foundWords.add(word);
                if (foundWords.size() == 2) {
                    break; // Break the loop when two words are found
                }
            }
        }

        if (foundWords.size() == 2) {
            String randomWord = createRandomWord(foundWords.get(0), foundWords.get(1)); // Create random word from both
            System.out.println("Found words: " + foundWords);
            System.out.println("Created random word: " + randomWord);
        } else {
            System.out.println("Less than two words found.");
        }
    }

    public static void main(String[] args) {
        String[] wordArray = {"banana", "apple", "orange", "kiwi", "pear", "grape"};
        findWordsAndCreateText(wordArray);
    }
}

