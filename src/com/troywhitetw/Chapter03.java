package com.troywhitetw;

import java.util.ArrayList;

public class Chapter03 {

    public static void main(String[] args) {
        question1();
        System.out.println("-----");
        question2();
    }

    private static void question1() {
        int result = gcd(1000, 495);
        System.out.println(result);
    }

    private static void question2() {
        int x = 3;
        int max = 1;
        int min = 1;
        ArrayList<Integer> resultArray = new ArrayList<>();

        for (int i = 1; i <= x; i++) {
            max *= 10;
        }
        max--;

        for (int i = 1; i <= x - 1; i++) {
            min *= 10;
        }

        for (int i = min; i <= max; i++) {
            int a = i / 100;
            int b = (i % 100) / 10;
            int c = (i % 100) % 10;
            if (Math.pow(a, x) + Math.pow(b, x) + Math.pow(c, x) == i) {
                resultArray.add(i);
            }
        }

        System.out.println(resultArray.toString());
    }

    private static int gcd(int x, int y) {
        int z = x % y;

        if (z == 0) {
            return y;
        } else {
            return gcd(y, z);
        }
    }
}
