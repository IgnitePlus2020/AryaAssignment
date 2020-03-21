package com.tgt.igniteplus;

import java.io.IOException;
import java.util.Scanner;

public class Bin2Dec {
    public static void main(String args[])throws IOException{
        Scanner in=new Scanner(System.in);
        System.out.println("enter the value of num:");
        long num=in.nextInt();
        int decimal=convertBinaryToDecimal(num);
        System.out.println("number:"+num);
        System.out.println(decimal);
    }
    public static int convertBinaryToDecimal(long num)
    {
        int decimalNumber=0,i=0;
        long remainder;
        while(num!=0)
        {
            remainder=num%10;
            num/=10;
            decimalNumber+=remainder*Math.pow(2,i);
        ++i;
        }
        return decimalNumber;
    }
}
