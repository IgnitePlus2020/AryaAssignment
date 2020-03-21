package com.tgt.igniteplus;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        n=sc.nextInt();
        if(n%2==0)
        {
            System.out.println("the given value is even");
        }
        else
        {
            System.out.println("given value is odd");
        }
    }
}
