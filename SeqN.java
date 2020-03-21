package com.tgt.igniteplus;

import java.io.IOException;

public class SeqN {
    public static void main(String args[])throws IOException{
        int i,j,c;
                System.out.println("series is:");
        for( i=1;i<10;i++)
        {
            c=1;
            for( j=1;j<=i;j++)
            {
               c=c*i;
            }
            System.out.println(c);
        }
    }
}
