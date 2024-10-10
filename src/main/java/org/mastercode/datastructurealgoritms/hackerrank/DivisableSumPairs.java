package org.mastercode.datastructurealgoritms.hackerrank;

import java.util.List;

public class DivisableSumPairs {
    public static void main(String[] args) {
        int n = 6;
        int k = 3;
        List<Integer> ar = List.of(1, 3, 2, 6, 1, 2);
        System.out.println(divisibleSumPairs(n, k, ar)); // Output: 3
    }
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int count = 0;
        // Write your code here
        for (int i = 0; i <= n - 1; ) {
            for (int j = 1 + i; j <= n - 1; ) {
                int sum = ar.get(i) + ar.get(j);
                if(sum%k==0){

                    count++;
                }
                j++;
            }
            i++;
        }
        return count;
    }
}