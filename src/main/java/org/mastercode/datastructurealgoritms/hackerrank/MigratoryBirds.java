package org.mastercode.datastructurealgoritms.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class MigratoryBirds {
    public static void main(String[] args) {
        List<Integer> arra = List.of(1, 4, 4, 4, 5, 3);
        System.out.println(migratoryBirds(arra));
    }

    /*
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        HashMap<Integer, Integer> birdCounts = new HashMap<>();
        int maxCount = 0;
        int birdType = 0;

        for (int bird : arr) {
            birdCounts.put(bird, birdCounts.getOrDefault(bird, 0) + 1);

            int count = birdCounts.get(bird);
            if (count > maxCount || (count == maxCount && bird < birdType)) {
                maxCount = count;
                birdType = bird;
            }
        }
        return birdType;
//        List<Integer> sums = new ArrayList<>();
//        int sum = 0;
//        for (int i = 0; i <= arr.size() - 1; i++) {
//            for (int j = 1; j <= arr.size() - 1; j++) {
//                if (Objects.equals(arr.get(i), arr.get(j))) {
//                    sum++;
//                }
//            }
//            sums.add(sum);
//            arr.remove(i);
//            sum = 0;
//
//        }
//
//        Collections.sort(sums);
//        return sums.get(0);
    }


}
