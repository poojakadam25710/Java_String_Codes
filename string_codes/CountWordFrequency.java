/**
 * Program Name: CountWordFrequency
 * Description: This program takes a full sentence from the user and counts
 *              the frequency of each unique word. The program continues 
 *              running until the user types "stop".
 * Author: Pooja Kadam
 */

package com.basic.string_codes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountWordFrequency {

    public static void main(String[] args) {

        // Scanner object to read input from user
        Scanner sc = new Scanner(System.in);

        while (true) {

            // Asking user to input a sentence
            System.out.println("Enter a string (or type 'stop' to stop):");
            String s = sc.nextLine();

            // Condition to end the program
            if (s.equalsIgnoreCase("stop")) {
                System.out.println("Program ended");
                break;
            }

            // Convert to lower case and split sentence into words
            // \\s+ matches one or more spaces
            String[] words = s.toLowerCase().split("\\s+");

            // HashMap to store each word and its frequency
            Map<String, Integer> countwords = new HashMap<>();

            // Counting each word's frequency
            for (String word : words) {
                countwords.put(word, countwords.getOrDefault(word, 0) + 1);
            }

            // Displaying each word with its count
            for (Map.Entry<String, Integer> entrymap : countwords.entrySet()) {
                System.out.println(entrymap.getKey() + " -> " + entrymap.getValue());
            }
        }

        // Closing the scanner to prevent resource leak
        sc.close();
    }
}
