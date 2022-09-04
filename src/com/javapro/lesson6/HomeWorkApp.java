package com.javapro.lesson6;


public class HomeWorkApp {

    public static void main(String[] args) {

        printThreeWords1();
        printThreeWords2();
        checkSumSign(10, -15);
        printColor(100);
        compareNumbers(5, 17);
        System.out.println(checkSumTrue(5, 16));
        checkPositive(-15);
        System.out.println(checkNegative(0));
        print("Hello", 5);
        System.out.println(years(2400));

    }

    public static void printThreeWords1() {
        String[] array = {"Orange", "Banana", "Apple"};
        for (String s : array) {
            System.out.println(s);
        }

    }

    public static void printThreeWords2() {
        System.out.println("""
                Orange
                Banana
                Apple""");
    }

    public static void checkSumSign(int a, int b) {
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Suma positive");
        } else {
            System.out.println("Suma negative");
        }
    }

    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Red");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
    }

    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean checkSumTrue(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void checkPositive(int a) {
        if (a >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Positive");
        }
    }

    public static boolean checkNegative(int a) {
        return a < 0;
    }

    public static void print(String s, int a) {
        while (a > 0) {
            System.out.println(s);
            a--;
        }
    }

    public static boolean years(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

    }

}
