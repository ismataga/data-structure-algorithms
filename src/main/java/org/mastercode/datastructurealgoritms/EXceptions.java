package org.mastercode.datastructurealgoritms;

public class EXceptions {
    public static int a() {
        try {
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }

    public static void main(String[] args) {
        System.out.println(a()); //Expected output: 3
    }
}

