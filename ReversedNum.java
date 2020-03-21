package com.tgt.igniteplus;
import java.util.Scanner;
public class ReversedNum {
    public static void main(String args[])
    {
        int n,r=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        n=sc.nextInt();
        while(n!=0)
        {
            int d=n%10;
            r=r*10+d;
            n/=10;
        }
        System.out.println("reversed number is:"+r);
    }
}
