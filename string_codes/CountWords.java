/**
 * Program Name: CountWords
 * Description: This program accepts a string from the user and counts the
 *              number of words in that string. The program continues running 
 *              until the user enters "stop".
 * Author: Pooja Kadam
 */

package com.basic.string_codes;

import java.util.Scanner;

public class CountWords {

    public static void main(String[] args) {

        // Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        while (true) {

            // Asking the user to input a sentence
            System.out.println("Enter a string (or enter 'stop' to stop):");
            String s = sc.nextLine();

            // Exit condition to stop the program
            if (s.equalsIgnoreCase("stop")) {
                System.out.println("Program ended");
                break;
            }

            // Convert string to lowercase and split into words using spaces
            // \\s+ matches one or more whitespace characters
            String[] words = s.toLowerCase().split("\\s+");

            // Display the total number of words
            System.out.println("Word count is: " + words.length);
        }

        // Closing the scanner to free system resources
        sc.close();
    }
}
