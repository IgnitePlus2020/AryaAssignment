package com.tgt.igniteplus;
import java.util.Scanner;
public class Sequ124 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();
        int i = 1, j=1;
        if(n>0)
        {
            while(i <= n)
            {
                if(j%3!=0)
                {
                    System.out.print(i + " ");
                    i = i+4*j;
                }
                j++;
            }
        }
        else{
            System.out.print("Enter the range greater then 0 : ");
        }
    }
}
