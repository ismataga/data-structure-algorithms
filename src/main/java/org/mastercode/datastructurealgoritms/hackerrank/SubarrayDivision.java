package org.mastercode.datastructurealgoritms.hackerrank;

import java.util.List;

public class SubarrayDivision {
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
            s.remove(i);
        }

        return total;
    }


}
