/**
 * ------------------------------------------------------------
 * Program Name : LongestWord
 * Description  : This program repeatedly accepts a string from 
 *                the user and finds the longest word(s) in the 
 *                entered string. The comparison is case-insensitive.
 * 
 *                If multiple words share the same maximum length, 
 *                all such words are displayed. The program continues 
 *                to run until the user types "stop".
 *
 * Author       : Pooja kadam
 * ------------------------------------------------------------
 */
package com.basic.string_codes;

import java.util.Scanner;

public class LongestWord {

    public static void main(String args[]) {

        // Scanner to read user input
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Enter a string (or enter 'stop' to stop)");
            String s = sc.nextLine();

            // Check if user wants to exit
            if (s.equalsIgnoreCase("stop")) {
                System.out.println("Program ended");
                break;
            }

            // Convert string to lowercase and split into words
            String[] words = s.toLowerCase().split(" ");

            // Variable to keep track of the longest word found
            String longest = "";

            // Determine the longest word length
            for (String word : words) {
                if (word.length() > longest.length()) {
                    longest = word;
                }
            }

            // Print all words with the longest length
            for (String w : words) {
                if (w.length() == longest.length()) {
                    System.out.println("Longest word is: " + w);
                }
            }
        }

        // Close scanner
        sc.close();
    }
}
