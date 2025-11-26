package com.basic.string_codes;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Program Name: AnagramString
 * Description: This program checks whether two input strings are anagrams or not.
 *              Two strings are considered anagrams if they contain the same characters
 *              with the same frequency, but possibly in a different order.
 *              The program ignores case differences (e.g., "Listen" and "Silent" are anagrams).
 *
 * Author:  Pooja kadam
 */
public class AnagramString {

    /**
     * Main method: handles user input and compares strings for anagram test.
     */
    public static void main(String[] args) {
    	// Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        
        // Infinite loop to allow multiple checks until user stops the program
        while (true) {
        	// Prompt user to enter the first string
            System.out.println("Enter a string:");
            String s1 = sc.next();
            
            // Prompt user to enter the second string
            System.out.println("Enter a second string (or enter \"stop\" to end):");
            String s2 = sc.next();

            // If user types “stop” (case-insensitive), exit the loop and end program
            if (s2.equalsIgnoreCase("stop")) {
                System.out.println("Program ended");
                break;
            }

            // Convert both strings to lower case to make comparison case-insensitive
            s1 = s1.toLowerCase();
            s2 = s2.toLowerCase();

            // Convert strings to char arrays
            char[] ch1 = s1.toCharArray();
            char[] ch2 = s2.toCharArray();

            // Sort the char arrays — this groups identical characters together
            Arrays.sort(ch1);
            Arrays.sort(ch2);

            // Compare sorted arrays: if equal, strings are anagrams
            System.out.println(Arrays.equals(ch1, ch2) ? "Anagram" : "Not Anagram");
        }
        
        // Close the Scanner object to release resources
        sc.close();
    }
}
