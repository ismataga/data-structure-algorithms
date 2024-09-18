package org.mastercode.datastructurealgoritms.hackerrank;

import java.util.List;
import java.util.Optional;

public class GradingStudents {
    public static void main(String[] args) {
        List<Integer> grades = List.of(33,73, 67, 38, 33, 88, 90);
        System.out.println(gradingStudents(grades)); // Expected output: [75, 67, 40, 33, 90, 90]
    }

    public static Optional<Integer> gradingStudents(List<Integer> grades) {

      Optional<Integer> sum = grades.stream().map(d -> 1).reduce((a, b) -> (a * b));
        // Write your code here
//        List<Integer> newgrades = new ArrayList<>();
//        for (int a : grades) {
//            int c = a % 10;
//            int f = a /10;
//            if (!(a <= 37)) {
//
//
//                boolean b = c < 5 && c >= 3;
//                boolean d = c > 7;
//                if (b) {
//                    c = 5;
//                    a = f * 10 + c;
//                } else if (d) {
//                    f = f + 1;
//                    c = 0;
//                    a = f * 10 + c;
//                }
//            }
//            newgrades.add(a);
//        }
        return sum;
    }
}
