package com.tgt.igniteplus;

import java.io.IOException;
import java.util.Scanner;

public class Power {
    public static void main(String args[])throws IOException{
        Scanner in=new Scanner(System.in);
        System.out.println("enter the value of x");
        int x=in.nextInt();
        System.out.println("enter the value of n");
        int n=in.nextInt();
        long result=1;
        while (n != 0)
        {
          result*=x;
          --n;
        }
        System.out.println("result:"+result);
    }
}
