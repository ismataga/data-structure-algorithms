package org.mastercode.datastructurealgoritms.hackerrank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegex2 {
    public static void main(String[] args) {
        // Input
        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        // Define the regular expression pattern
        String regex = "(?i)\\b(\\w+)(\\b\\W+\\1\\b)*"; // Matches any repeated word with word boundaries

        // Loop through each sentence
        while (numSentences-- > 0) {
            String input = in.nextLine();

            // Create a pattern matcher
            Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
            Matcher m = p.matcher(input);

            // Using StringBuffer for efficient replacements
            StringBuffer result = new StringBuffer();
            while (m.find()) {
                // Ensure that we only keep the first occurrence
                m.appendReplacement(result, m.group(1));
            }
            m.appendTail(result);

            // Print the modified sentence
            System.out.println(result.toString());
        }

        in.close();
    }
}
