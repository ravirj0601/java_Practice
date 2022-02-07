package com.Ravi;

import java.util.Scanner;

public class Palindrome {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a Number :- ");
        int n = in.nextInt();
        System.out.println(reverse(n));
        if (checkPalind(n)) {
            System.out.println("Its a Palindrome number.");
        }else{
            System.out.println("its not a Palindrome number.");
        }
    }

    private static boolean checkPalind(int n) {
        return n == reverse(n);
    }

    private static int reverse(int n) {
        int v,newN=0;
        while(n>0){
             v = n%10;
             n = n/10;
             newN = (newN * 10) + v;
        }
        return newN;
    }

}
