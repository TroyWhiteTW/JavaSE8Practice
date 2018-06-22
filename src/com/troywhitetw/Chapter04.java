package com.troywhitetw;

import java.util.ArrayList;
import java.util.Collections;

public class Chapter04 {

    public static void main(String[] args) {
        question1();
        System.out.println("-----");
        question2();
        System.out.println("-----");
        question3();
        System.out.println("-----");
        question4();
    }

    private static void question1() {
        int x = 10;

        ArrayList<Integer> fibonacciArray = new ArrayList<>();
        fibonacciArray.add(0);
        fibonacciArray.add(1);

        if (x >= fibonacciArray.size()) {
            for (int i = fibonacciArray.size(); i < x; i++) {
                fibonacciArray.add(fibonacciArray.get(i - 1) + fibonacciArray.get(i - 2));
            }
        }

        for (int item : fibonacciArray) {
            System.out.println(item);
        }
    }

    private static void question2() {
        ArrayList<Card> cards = new ArrayList<>(52);
        for (int i = 0; i < 52; i++) {
            cards.add(new Card(suit(i + 1), symbol(i + 1)));
        }
        System.out.println(cards.toString());
        shuffle(cards);
        System.out.println(cards.toString());
    }

    private static void question3() {
        int[] number = {70, 80, 31, 37, 10, 1, 48, 60, 33, 80};
        ArrayList<Integer> numberArrayList = new ArrayList<>();
        for (int i : number) {
            numberArrayList.add(i);
        }

        ArrayList<Integer> resultArrayList = new ArrayList<>();

        for (int i = 0; i < number.length; i++) {

            int tempMin = 100;
            int tempIndex = 100;
            for (int j = 0; j < numberArrayList.size(); j++) {
                if (numberArrayList.get(j) < tempMin) {
                    tempMin = numberArrayList.get(j);
                    tempIndex = j;
                }
            }
            resultArrayList.add(tempMin);
            numberArrayList.remove(tempIndex);

        }

        System.out.println(resultArrayList.toString());
    }

    private static void question4() {
        int select = 5;
        int[] number = {1, 10, 31, 33, 37, 48, 60, 70, 80};
        for (int i = 0; i < number.length; i++) {
            if (number[i] == select) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }

    private static String suit(int number) {
        switch ((number - 1) / 13) {
            case 0:
                return "黑桃";
            case 1:
                return "紅心";
            case 2:
                return "方塊";
            default:
                return "梅花";
        }
    }

    private static String symbol(int number) {
        int value = number % 13;
        switch (number % 13) {
            case 0:
                return "K";
            case 1:
                return "A";
            case 11:
                return "J";
            case 12:
                return "Q";
            default:
                return "" + value;
        }
    }

    private static void shuffle(ArrayList cards) {
        for (int i = 0; i < cards.size(); i++) {
            Collections.swap(cards, i, (int) (Math.random() * cards.size() - 1));
        }
    }
}

class Card {
    private String suit;
    private String symbol;

    Card(String suit, String symbol) {
        this.suit = suit;
        this.symbol = symbol;
    }

    public String toString() {
        return suit + symbol;
    }
}
