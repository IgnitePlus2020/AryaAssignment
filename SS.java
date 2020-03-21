package com.tgt.igniteplus;
import java.util.Scanner;
public class SS {
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
                System.out.print(i +" ");
                i = i + (j*j);
                j++;
            }
        }
    }
}
