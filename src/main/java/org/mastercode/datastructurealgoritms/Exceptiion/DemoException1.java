package org.mastercode.datastructurealgoritms.Exceptiion;

public class DemoException1 {
    public static void method1() {
        try {
            System.out.println("1");
        } catch (Exception e) {
            System.out.println(    "return 2;");
        } finally {
            System.out.println("3");
        }
    }

    public static void main(String[] args) {
method1();    }
}
