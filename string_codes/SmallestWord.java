/**
 * ------------------------------------------------------------
 * Program Name : SmallestWord
 * Description  : This program continuously accepts a string 
 *                from the user and finds the smallest word(s)
 *                in the entered string. The user can type 
 *                "stop" to terminate the program.
 *                
 *                The comparison is case-insensitive and words 
 *                are evaluated based on their length. If multiple 
 *                words have the same smallest length, all of them 
 *                are displayed.
 *
 * Author       : Pooja kadam
 * ------------------------------------------------------------
 */

package com.basic.string_codes;

import java.util.Scanner;

public class SmallestWord {

    public static void main(String args[]) {

        // Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Enter a string (or enter 'stop' to stop)");
            String s = sc.nextLine();

            // Check termination condition
            if (s.equalsIgnoreCase("stop")) {
                System.out.println("Program ended");
                break;
            }

            // Convert entire string to lowercase and split into words
            String[] words = s.toLowerCase().split(" ");

            // Assume the first word is the smallest initially
            String smallest = words[0];

            // Loop to find the smallest word by length
            for (String word : words) {
                if (word.length() < smallest.length()) {
                    smallest = word;
                }
            }

            // Print all words having the smallest length
            for (String w : words) {
                if (w.length() == smallest.length()) {
                    System.out.println("Smallest word in the string is: " + w);
                }
            }
        }

        // Close scanner resource
        sc.close();
    }
}
