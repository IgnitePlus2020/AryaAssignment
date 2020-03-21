package com.tgt.igniteplus;

import java.io.IOException;
import java.util.Scanner;

public class factorial {
    public static void main(String args[])throws IOException{
        Scanner in=new Scanner(System.in);
        System.out.println("enter the value of n");
        int i,fact=1,n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("factorial of given number is :"+fact);
    }
}
