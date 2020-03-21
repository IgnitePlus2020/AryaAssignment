package com.tgt.igniteplus;
import java.util.Scanner;
public class SumEO {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print(" Please Enter any Number : ");
        int number = sc.nextInt();
        int evenSum=0,oddSum=0;
        for(int i = 1; i <= number; i++)
        {
            if(i % 2 == 0)
            {
                evenSum = evenSum + i;
            }
            else
            {
                oddSum = oddSum + i;
            }
        }
        System.out.println("\n The Sum of Even Numbers upto " + number + "  =  " + evenSum);
        System.out.println("\n The Sum of Odd Numbers upto " + number + "  =  " + oddSum);
    }
}
