/**
 * Program Name: ReverseString
 * Description: This program takes a string input from the user
 *              and prints the reversed version of that string.
 * Author: Pooja Kadam
 */

package com.basic.string_codes;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        // Creating Scanner object to read input from the keyboard
        Scanner sc = new Scanner(System.in);

        // Prompt the user for input
        System.out.println("Enter a string (or enter 'stop' to stop):");
        String s = sc.next();  // Reads a single word from user

        // Variable to hold the reversed string
        String rev = "";

        // Loop through the string from last character to first
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i); // Retrieve character at position i
            rev += ch;             // Add the character to reversed string
        }

        // Print the reversed string
        System.out.println("The reverse string is: " + rev);

        // Closing Scanner to free system resources
        sc.close();
    }
}
