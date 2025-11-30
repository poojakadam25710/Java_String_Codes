/**
 * Description: This program removes duplicate characters from a string.
 *              It repeatedly accepts user input until the user types 'stop'.
 *              For each entered string, it prints each unique character only once
 *              in the order of their first appearance.
 *
 * Author: Pooja Kadam
 */

package com.basic.string_codes;

import java.util.Scanner;

public class RemoveDuplicateCharacter {
    
    public static void main(String args[]) {

        // Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        while (true) {

            // Prompt user for input
            System.out.println("Enter a string (or enter 'stop' to stop)");

            // Read input string
            String s = sc.next();
            s = s.toLowerCase();   // Convert to lowercase for uniform processing

            // Stop the program when the user enters "stop"
            if (s.equalsIgnoreCase("stop")) {
                System.out.println("Program ended");
                sc.close();
                break;
            }

            // Boolean array to track already-printed characters
            boolean[] seen = new boolean[250];

            // Loop through each character in the string
            for (int i = 0; i < s.length(); i++) {

                char ch = s.charAt(i);   // Current character

                // If character has not been printed before, print it and mark as seen
                if (!seen[ch]) {
                    System.out.println(ch);
                    seen[ch] = true;
                }
            }
        }
    }
}