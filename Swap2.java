package com.tgt.igniteplus;
import java.io.IOException;
import java.util.*;

public class Swap2 {
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("before swaping");
        int a=sc.nextInt();
        System.out.println("a="+a);
        int b=sc.nextInt();
        System.out.println("b="+b);
       int temp=a;
        a=b;
        b=temp;
        System.out.println("after swaping");
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
