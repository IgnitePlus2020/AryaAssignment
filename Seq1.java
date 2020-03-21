package com.tgt.igniteplus;

import java.io.IOException;

public class Seq1 {
    public static void main(String args[])throws IOException{
        int n=10;
        for(int i=1;i<n;i++)
        {
            if(i%2==0)
                System.out.println(i);
            else
                System.out.println(-1*i);
        }
    }
}
