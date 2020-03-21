package com.tgt.igniteplus;

import java.io.IOException;
import java.util.*;

public class swap3 {
    public static void main(String args[])throws IOException
    {
        Scanner in=new Scanner(System.in);
        System.out.println("before swaping");
        System.out.println("enter the value of a");
        int a=in.nextInt();
        System.out.println("a="+a);
        System.out.println("enter the value of b");
        int b=in.nextInt();
        System.out.println("b="+b);
        System.out.println("enter the value of c");
        int c=in.nextInt();
        System.out.println("c="+c);
        int  temp=a;
        a=b;
        b=c;
        c=temp;
        System.out.println("after swaping");
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        System.out.println("c:"+c);
    }

}
