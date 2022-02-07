package com.Ravi;

import java.util.Scanner;

public class LegalAge {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter your Age :- ");
        byte age = in.nextByte();
        if (legalAge(age)) {
            System.out.println("You Are Not Eligible.");
        }else{
            System.out.println("You are Eligible");
        }
    }

    private static boolean legalAge(byte age) {
        return age < 18;
    }
}
