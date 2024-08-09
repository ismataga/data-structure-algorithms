package org.mastercode.datastructurealgoritms.hackerrank;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PlusMinus {
    public static void main(String[] args) {
        plusMinus(Arrays.asList(-4, 3, -9, 0, 4, 1));
    }

    public static void plusMinus(List<Integer> arr) {

            int size = arr.size();
            double positiveCount = 0;
            double negativeCount = 0;
            double zeroCount = 0;

            for (int number : arr) {
                if (number > 0) {
                    positiveCount++;
                } else if (number < 0) {
                    negativeCount++;
                } else {
                    zeroCount++;
                }
            }

//        long positiveCount = arr.stream().filter(n -> n > 0).count();
//        long negativeCount = arr.stream().filter(n -> n < 0).count();
//        long zeroCount = arr.stream().filter(n -> n == 0).count();

            System.out.printf("%.6f%n", positiveCount / size);
            System.out.printf("%.6f%n", negativeCount / size);
            System.out.printf("%.6f%n", zeroCount / size);
            List<Integer> list = new LinkedList<>();

    }

}

