package com.Ravi;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("--press 1 for 2 no Sum--");
        System.out.println("--press 2 for 3 no Sum--");
        System.out.println("--press 3 for Product of 2 no--");
        int choice = in.nextByte();
        int num, num1,sum;
        System.out.print("Enter The First No:- ");
        num = in.nextByte();
        System.out.print("Enter The Second  No:- ");
        num1 = in.nextByte();
        switch (choice) {
            case 1 -> System.out.println("Sum of the Two no: " + sum(num,num1));
//            case 2 -> System.out.println("Sum of three No: " + sum2(20, 30, 10));
            case 3 -> System.out.println("Product of Two No: " + product(num,num1));
            default -> System.out.println("Wrong Choice");
        }

    }

    private static int product(int a,int b) {
        int product = a * b;
        return product;
    }

    private static int sum(int num,int num1) {

        int sum = num+num1;
        return sum;
    }
}
