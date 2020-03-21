package com.tgt.igniteplus;

import java.io.IOException;
import java.util.Scanner;

public class Prime {
    public static void main(String args[])throws IOException
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the value of m");
        int m = in.nextInt();
        System.out.println("enter the value of n");
        int n = in.nextInt();

        while (m<n) {
            boolean flag = false;

            for(int i = 2; i <= m/2; ++i) {
                // condition for nonprime number
                if(m % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                System.out.print(m+ " ");
            ++m;
        }
    }

}
