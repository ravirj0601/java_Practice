package com.Ravi;

import java.util.Scanner;

public class LargeAndSmall {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Three number's:- ");
        byte a = in.nextByte();
        byte b = in.nextByte();
        byte c = in.nextByte();
        byte large = large(a,b,c);
        byte small = small(a,b,c);
        System.out.println("Largest No is:- " + large);
        System.out.print("Smallest No is:- " + small);
    }

    private static byte small(byte a, byte b, byte c) {
        byte s = 0;
        if (a < b) {
            if (a < c) {
                s = a;
            }
        }
        else if (b < c) {
            s = b;
        }
        else
            s = c;
        return s;
    }

    private static byte large(byte a, byte b, byte c) {
       int l = 0;
        if (a > b) {
            if (a > c) {
                 l = a;
            }
        }
        else if (b > c) {
            l = b;
        }
        else
            l = c;
        return (byte) l;
    }
}
