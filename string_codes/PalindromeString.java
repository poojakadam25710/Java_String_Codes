/**
 * Program Name: PalindromeString
 * Description: This program takes a string from the user and checks whether
 *              the string is a palindrome. A palindrome reads the same 
 *              forwards and backwards. The program keeps running until the 
 *              user enters "stop".
 * Author: Pooja Kadam
 */

package com.basic.string_codes;

import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {

        // Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        while (true) {

            // Asking the user to enter a string
            System.out.println("Enter a string (or enter 'stop' to stop):");
            String s = sc.next();  // Reads one word input

            // Exit condition to stop the program
            if (s.equalsIgnoreCase("stop")) {
                System.out.println("Program ended");
                break;
            }

            // Variable to hold the reversed string
            String rev = "";

            // Loop to reverse the string
            for (int i = s.length() - 1; i >= 0; i--) {
                char ch = s.charAt(i);  // Get character at index i
                rev += ch;              // Append to reversed string
            }

            // Checking if original and reversed strings are the same
            if (s.equalsIgnoreCase(rev)) {
                System.out.println("String is palindrome");
            } else {
                System.out.println("String is not palindrome");
            }
        }

        // Closing the scanner to free system resources
        sc.close();
    }
}
