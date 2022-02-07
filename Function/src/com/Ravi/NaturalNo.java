package com.Ravi;

import java.util.Scanner;

public class NaturalNo {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter Your no:- ");
        int n = in.nextInt();
        System.out.println("Natural is :- " + natural(n));
    }

    private static int natural(int n) {
        int ans=0;
        if (n > 0){
            for (int i = n; i >=0 ; i--) {
                ans = ans + i;
            }
        }
        return ans;
    }
}
