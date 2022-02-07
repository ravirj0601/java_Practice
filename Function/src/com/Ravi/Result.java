package com.Ravi;

import java.util.Scanner;

public class Result {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter Your Total Percentage out of 100:- ");
        byte percentage = in.nextByte();
        System.out.println("Your Grade is " + grade(percentage));
    }

    private static String grade(byte p) {
        String ans;
        if (p < 100 & p > 91) {
            ans = "AA";
        } else {
            if (p <= 90 & p >= 81) {
                ans = "AB";
            } else {
                if (p <= 80 & p >=71) {
                    ans = "BB";
                }else if (p <= 70 & p >=61) {
                    ans = "BC";
                }else if (p <= 60 & p >= 51) {
                    ans = "CD";
                }else if (p <= 50 & p >= 41) {
                    ans = "DD";
                }else{
                    ans = "Fail";
                }
            }
        }
        return ans;
    }
}
