package com.company;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int first, second, result1, result2;
        System.out.println("first num ");
        first = num.nextInt();
        System.out.println("second num ");
        second = num.nextInt();
        result1 = first + second;
        result2 = first - second;
        System.out.println("sum  " + result1);
        System.out.println("diff " + result2);
                }
}