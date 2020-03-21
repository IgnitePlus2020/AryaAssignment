package com.tgt.igniteplus;
import java.util.Scanner;
public class Sequence {
    public static void main(String args[])
    {
        System.out.print("enter the limit :");
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        if(limit > 1)
        {
            int[]a = new int[limit];
            a[0] = 0 ;
            a[1] = 1;
            for(int i = 2; i < limit; i++)
            {
                a[i] = a[i-1] + a[i-2];
            }
            for(int i= 0 ; i < limit ; i++)
            {
                System.out.print(a[i] +", ");
            }
        }
        else
        {
            System.out.print("Limit must be greater then 1 :");
        }
    }
}
