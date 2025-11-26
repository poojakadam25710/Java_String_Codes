/**
 * Program Name: CountCharacterFrequency
 * Description: This program allows the user to enter a string and displays
 *              the frequency of each character in that string. The program
 *              continues to accept input until the user enters "stop".
 * Author: Pooja Kadam
 */

package com.basic.string_codes;

import java.util.Scanner;

public class CountCharacterFrequency {

    public static void main(String[] args) {

        // Scanner object to read user input from keyboard
        Scanner sc = new Scanner(System.in);

        while (true) {

            // Taking input from the user
            System.out.println("Enter a string (or enter 'stop' to stop)");
            String s = sc.next();

            // Exit condition to stop the program
            if (s.equalsIgnoreCase("stop")) {
                System.out.println("Program ended");
                break;
            }

            // Array to store frequency of ASCII characters (0–255)
            int[] chars = new int[256];

            // Loop through each character and count its occurrences
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);

                // Ignore spaces (optional)
                if (ch != ' ') {
                    chars[ch]++;
                }
            }

            // Display characters and their frequencies
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] > 0) {
                    System.out.println((char) i + " ---> " + chars[i]);
                }
            }
        }

        // Close the scanner to free system resources
        sc.close();
    }
}
