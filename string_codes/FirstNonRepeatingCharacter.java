/**
 * Title: First Non-Repeating Character Finder
 * Description: 
 * This program reads a string from the user and identifies the first 
 * non-repeating (unique) character in that string. The comparison is 
 * case-insensitive, and the program continues to accept input until 
 * the user types "stop". Uses LinkedHashMap to preserve insertion order 
 * while counting occurrences of characters.
 * Author: Pooja Kadam
 */

package com.basic.string_codes;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    public static void main(String args[]) {

        // Scanner to read user input
        Scanner sc = new Scanner(System.in);

        while (true) {

            // Prompt user for a string
            System.out.println("Enter a string (or enter 'stop' to stop): ");
            String s = sc.next();

            // Exit the loop if user enters "stop"
            if (s.equalsIgnoreCase("stop")) {
                System.out.println("Program ended");
                break;
            }

            // Convert the string to lowercase for uniform comparison
            s = s.toLowerCase();

            // Convert string to a character array
            char[] chars = s.toCharArray();

            // Map to store character counts (LinkedHashMap keeps the order)
            Map<Character, Integer> map = new LinkedHashMap<>();

            // Count the frequency of each character
            for (char character : chars) {
                map.put(character, map.getOrDefault(character, 0) + 1);
            }

            boolean found = false;

            // Find the first character with a frequency of 1
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() == 1) {
                    System.out.println("First non-repeating character is: " + entry.getKey());
                    found = true;
                    break;
                }
            }

            // If no unique character exists
            if (!found) {
                System.out.println("No non-repeating character found.");
            }
        }

        // Close the scanner
        sc.close();
    }
}
