package org.mastercode.datastructurealgoritms.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class DiagonalDifference {
    public static void main(String[] args) {
        List<List<Integer>> listOfLists = new ArrayList<>();

        listOfLists.add(Arrays.asList(11, 2, 4));
        listOfLists.add(Arrays.asList(4, 5, 6));
        listOfLists.add(Arrays.asList(10, 8, -12));
        diagonalDifference(listOfLists);
        System.out.println(diagonalDifference(listOfLists));
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        int sum1 = 0;
        int sum2 = 0;

            int n = arr.size();

            for (int i = 0; i < n; i++) {
                // Get diagonal elements
                int primaryDiagonal = arr.get(i).get(i);
                int secondaryDiagonal = arr.get(i).get(n - i - 1);

                // Check if both elements are within the range and update sums
                if (-100 <= primaryDiagonal && primaryDiagonal <= 100
                        && -100 <= secondaryDiagonal && secondaryDiagonal <= 100) {
                    sum1 += primaryDiagonal;
                    sum2 += secondaryDiagonal;
                }
            }

            int sums = sum1 - sum2;

            int sum3 = IntStream.range(0, n)
                    .map(i -> arr.get(i).get(i))
                    .sum();

            int sum4 = IntStream.range(0, n)
                    .map(i -> arr.get(i).get(n - i - 1))
                    .sum();

            return Math.abs(sums);

    }

}
