package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LetterAnalyzer {

    // Method to check if a word has repeated letters
    public static boolean hasRepeatedLetters(String word) {
        int[] letterCount = new int[26]; // Array to count occurrences of each letter

        // Iterate through each character in the word
        for (char letter : word.toCharArray()) {
            letterCount[letter - 'a']++; // Increment the count for the letter
            if (letterCount[letter - 'a'] > 1) {
                return true; // Return true if the letter appears more than once
            }
        }
        return false; // Return false if no letter is repeated
    }

    // Method to create a random word from two input words
    public static String createRandomWord(String word1, String word2) {
        List<Character> uniqueLetters = new ArrayList<>(); // List to store unique letters

        // Add unique letters from the first word
        for (char letter : word1.toCharArray()) {
            if (!uniqueLetters.contains(letter)) {
                uniqueLetters.add(letter); // Add letter if it's not already in the list
            }
        }
        // Add unique letters from the second word
        for (char letter : word2.toCharArray()) {
            if (!uniqueLetters.contains(letter)) {
                uniqueLetters.add(letter); // Add letter if it's not already in the list
            }
        }

        Collections.shuffle(uniqueLetters); // Shuffle the letters randomly

        StringBuilder newWord = new StringBuilder(); // StringBuilder to construct the new word
        for (char letter : uniqueLetters) {
            newWord.append(letter); // Append shuffled letters to the new word
        }

        return newWord.toString(); // Return the new word
    }

    // Method to find words with repeated letters and create a new word
    public static void findWordsAndCreateText(String[] words) {
        ArrayList<String> foundWords = new ArrayList<>(); // List to store found words

        // Iterate through the provided words
        for (String word : words) {
            if (hasRepeatedLetters(word)) {
                foundWords.add(word); // Add the word if it has repeated letters
                if (foundWords.size() == 2) {
                    break; // Stop searching after finding two words
                }
            }
        }

        // Check if two words were found and create a new word
        if (foundWords.size() == 2) {
            String randomWord = createRandomWord(foundWords.get(0), foundWords.get(1)); // Create random word from both
            System.out.println("Found words: " + foundWords);
            System.out.println("Created random word: " + randomWord);
        } else {
            System.out.println("Less than two words found."); // Notify if less than two words are found
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        String[] wordArray = {"banana", "apple", "orange", "kiwi", "pear", "grape"}; // Array of sample words
        findWordsAndCreateText(wordArray); // Call method to find words and create a new word
    }
}

