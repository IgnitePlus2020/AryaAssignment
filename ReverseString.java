package com.tgt.igniteplus;
import java.lang.*;
import java.io.IOException;
import java.lang.annotation.Target;
import java.util.*;
public class ReverseString {
    public static void main(String args[])throws IOException{
        Scanner in=new Scanner(System.in);
        System.out.println("enter the string to be reversed");
        String input=in.next();
        byte [] strAsByteArray=input.getBytes();
        byte [] result=new byte[strAsByteArray.length];
        for(int i=0;i<strAsByteArray.length;i++)
            result[i]=strAsByteArray[strAsByteArray.length-i-1];
        System.out.println(new String(result));
    }

}
