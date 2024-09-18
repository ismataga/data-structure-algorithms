package org.mastercode.datastructurealgoritms.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BirthdayCakeCandles {
    public static void main(String[] args) {
        List<Integer> candles = new ArrayList<>(List.of(3, 2, 1, 3));
        birthdayCakeCandles(candles);
    }

    public static int birthdayCakeCandles(List<Integer> candles) {

        candles.sort(Collections.reverseOrder());
        int max = candles.get(0);
        return (int) candles.stream()
                .takeWhile(a -> a == max)
                .count();

    }
}
