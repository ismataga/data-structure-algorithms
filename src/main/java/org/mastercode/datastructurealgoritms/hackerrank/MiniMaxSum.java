package org.mastercode.datastructurealgoritms.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MiniMaxSum {
    public static void main(String[] args) {
        List<Integer> arr = List.of(1, 4, 3, 2, 5);
        MiniMaxSum sum = new MiniMaxSum();
        sum.miniMaxSum(arr);
    }

    public static void miniMaxSum(List<Integer> arr) {

        long sum = arr.stream().mapToLong(Integer::longValue).sum();
        List<Long> result = new ArrayList<>();

        for (long num : arr) {
            result.add(sum - num);
        }

        Collections.sort(result);

        System.out.println(result.get(0) + " " + result.get(result.size() - 1));


//        int n = arr.size();
//        int sum = 0;
//        int sum1;
//        int sum2;
//        int sum3;
//        int sum4;
//        int sum5;
//
//        for (Integer integer : arr) {
//            sum += integer;
//        }
//        List<Integer> result =new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            if (i== 0) {
//                sum1 = sum - arr.get(i);
//                result.add(sum1);
//            } else if (i == 1) {
//                sum2 = sum - arr.get(i);
//                result.add(sum2);
//            } else if (i == 2) {
//                sum3 = sum - arr.get(i);
//                result.add(sum3);
//            } else if (i == 3) {
//                sum4 = sum - arr.get(i);
//                result.add(sum4);
//            } else if (i == 4) {
//                sum5 = sum - arr.get(i);
//                result.add(sum5);
//            }
//
//        }
//        Collections.sort(result);
//
//        System.out.println(result.get(0)+" "+result.get(4));



    }

}
