package com.Ravi;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("--press 1 for 2 no Sum--");
        System.out.println("--press 2 for 3 no Sum--");
        int choice = in.nextByte();
        switch (choice) {
            case 1 -> System.out.println("Sum of the Two no: " + sum());
            case 2 -> System.out.println("Sum of three No: " + sum2(20, 30, 10));
            default -> System.out.println("Wrong Choice");
        }

    }

    private static int sum2(int a,int b,int c) {
        Scanner in = new Scanner(System.in);
        int num, num1,num2,sum;
        System.out.print("Enter Three Numbers: -");
        num = in.nextByte();
        num1 = in.nextByte();
        num2 = in.nextByte();
        sum = num+num1+num2;
        return sum;
    }

    private static int sum() {
        Scanner in = new Scanner(System.in);
        int num, num1,sum;
        System.out.print("Enter The First No:- ");
        num = in.nextByte();
        System.out.print("Enter The Second  No:- ");
        num1 = in.nextByte();
        sum = num+num1;
        return sum;
    }
}
