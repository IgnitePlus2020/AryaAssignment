package com.tgt.igniteplus;

import java.io.IOException;
import java.util.Scanner;

public class Greatest {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a:");
        int a = sc.nextInt();
        System.out.println("enter the value of b:");
        int b = sc.nextInt();
        System.out.println("enter the value of c:");
        int c = sc.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println("a is greater than b and c");
            } else {
                System.out.println("c is greater than b and a");
            }
        } else if (b > c)
            System.out.println("b is greater than a and c");
        else
            System.out.println("c is greater than a and b");
    }
}