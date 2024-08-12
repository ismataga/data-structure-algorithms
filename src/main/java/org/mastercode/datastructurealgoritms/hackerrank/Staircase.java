package org.mastercode.datastructurealgoritms.hackerrank;

public class Staircase {
    public static void main(String[] args) {
        staircase(6);  // Print a staircase with 6 steps.
        // Expected output:
        // #
        // ##
        // ###
        // ####
        // #####
        // ######
    }
    public static void staircase(int n) {
            for (int i = 0; i < n; i++) {
                // Print leading spaces
                for (int j = 0; j < n - i - 1; j++) {
                    System.out.print(" ");
                }
                // Print '#' characters
                for (int j = 0; j <= i; j++) {
                    System.out.print("#");
                }
                // Move to the next line
                System.out.println();
            }

    }
}
