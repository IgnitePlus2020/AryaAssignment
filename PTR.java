package com.tgt.igniteplus;

import java.io.IOException;
import java.util.Scanner;

public class PTR {
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the principle amount of sum");
        float p=sc.nextFloat();
        System.out.println("enter the time peroid");
        int t=sc.nextInt();
        System.out.println("enter the rate of intrest");
        float r=sc.nextFloat();
        float s=p*t*r/100;
        System.out.println("the simple intrest on given amoutn is:"+s);
    }
}
