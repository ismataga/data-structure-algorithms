package org.mastercode.datastructurealgoritms.hackerrank;

import java.util.Arrays;

public class JavaAnagram {

    static boolean isAnagram(String a, String b) {
        // Convert both strings to uppercase for case-insensitive comparison
        String c = a.toUpperCase();
        String d = b.toUpperCase();

        // If lengths are different, they can't be anagrams
        if (c.length() != d.length()) {
            return false;
        }

        // Create a frequency array for 26 letters of the English alphabet
        int[] charCount = new int[26];

        // Count each character in the first string
        for (char ch : c.toCharArray()) {
            charCount[ch - 'A']++;
        }

        // Subtract the counts for each character in the second string
        for (char ch : d.toCharArray()) {
            charCount[ch - 'A']--;
        }

        // Check if all counts are zero
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true; // All count
    }

    public static void main(String[] args) {
        String a = "Hello";
        String b = "hello";
        System.out.println(isAnagram(a, b));
    }
}
