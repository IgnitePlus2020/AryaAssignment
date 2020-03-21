package com.tgt.igniteplus;

import java.io.IOException;
import java.util.Scanner;

public class Armstrong {
    public static void main(String args[])throws IOException{
        Scanner in=new Scanner(System.in);
        System.out.println("enter n value");
        int sum=0,temp,digit,n=in.nextInt();
        temp=n;
        while(temp>0)
        {
            digit=temp%10;
            sum+=Math.pow(digit,3);
            temp/=10;
        }
        if(n==sum)
            System.out.println("given number is an armstrong num:"+n);
        else
            System.out.println("given number is not an armstrong num:"+n);

    }

}
