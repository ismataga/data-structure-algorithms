package org.mastercode.datastructurealgoritms.hackerrank;

import java.util.Arrays;
import java.util.List;

public class SubarrayDivision {
    public static void main(String[] args) {
        List<Integer> s = Arrays.asList(2, 5, 1, 3, 4, 4, 3, 5, 1, 1, 2, 1, 4, 1, 3, 3, 4, 2, 1);
        int d = 18;  // Sum to match
        int m = 7;  // Length of the sublist

      Integer result = birthday(s, d, m);
        System.out.println(result);
    }
    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int sum = 0;
        int total = 0;
        for (int i = 0; i < s.size(); i++) {
            for (int j = 0; j < m; j++) {
                sum += s.get(j);


            }
            if (sum == d) {
                total++;
            }
            sum = 0;
        }

        return total;
    }


}
