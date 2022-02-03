package com.Ravi;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        System.out.println("Welcome "+greeting());
    }

    private static String greeting() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Name:- ");
        String name = in.next();
        return name;
    }
}
