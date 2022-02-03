package com.Ravi;

import java.util.Scanner;

public class EvanOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number:- ");
        int a = in.nextInt();
        boolean c = checkIt(a);
        System.out.println("Is It Even or Not :- " + c);
    }

    private static boolean checkIt(int a) {
        if (a % 2 == 0) {
            return true;
        }else {
            return false;
        }
    }
}
