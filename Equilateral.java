package com.tgt.igniteplus;

import java.util.Scanner;
import java.io.IOException;

public class Equilateral {
    public static void main(String args[])throws IOException{
        Scanner in=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=in.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=n-1;j>1;j--) {

                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}