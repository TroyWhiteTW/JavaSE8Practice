package com.troywhitetw;

public class NineNineTable {

    public static void main(String[] args) {
        table();
        System.out.println("-----");
        table2();
        System.out.println("-----");
        table3();
    }

    private static void table() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%d*%d=%2d ", j, i, j * i);
            }
            System.out.println();
        }
    }

    private static void table2() {
        for (int i = 2, j = 1; j < 10; ) {
            System.out.printf("%d*%d=%2d ", i, j, i * j);
            if (i == 9) {
                j++;
                i = 2;
                System.out.println();
            } else {
                i++;
            }
        }
    }

    private static void table3() {
        for (int i = 2, j = 1; j < 10; i = (i == 9) ? ((++j / j) + 1) : (i + 1)) {
            System.out.printf("%d*%d=%2d%c", i, j, i * j, (i == 9) ? '\n' : ' ');
        }
    }
}
