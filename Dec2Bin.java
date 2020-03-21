package com.tgt.igniteplus;

import java.io.IOException;
import java.util.Scanner;

public class Dec2Bin {
    public static void main(String args[])throws IOException{

        System.out.println("enter the value of num:");
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        long binary=convertDecimalToBinary(num);
        System.out.println("num:"+num);
        System.out.println(binary);
    }
    public static long convertDecimalToBinary(int n)
    {
        long binaryNunber=0;
        int remainder,i=1,step=1;
        while(n!=0)
        {
            remainder=n%2;
           n/=2;
           binaryNunber+=remainder*i;
           i*=10;
        }
        return binaryNunber;
    }
    {

    }
}
