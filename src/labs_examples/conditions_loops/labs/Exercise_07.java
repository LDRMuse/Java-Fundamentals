package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 * <p>
 * Take in a word from the user and using a "while" loop, find the first vowel in the word.
 * Once you find the vowel, print out the word and the first vowel.
 * <p>
 * Hints:
 * - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 * - you'll likely want to use a String that contains all the vowels:
 * - ie: String vowels = "aeiou";
 */

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type a word: ");

        String word = scanner.next().toLowerCase();
        printOutFirstVowelFromTheWord(word);

    }

    public static void printOutFirstVowelFromTheWord(String word) {
        int index = 0;

        while (index < word.length()) {
                if (word.charAt(index) == 'a') {
                    System.out.println('a');
                    break;
                } else if (word.charAt(index) == 'e') {
                    System.out.println('e');
                    break;
                } else if (word.charAt(index) == 'i') {
                    System.out.println('i');
                    break;
                } else if (word.charAt(index) == 'o') {
                    System.out.println('o');
                    break;
                } else if (word.charAt(index) == 'u') {
                    System.out.println('u');
                    break;
                }
            printOutWordFromUser(word);
            index++;
        }

    }

    public static void printOutWordFromUser(String word) {
        System.out.println("You typed: " + word);
    }

}

