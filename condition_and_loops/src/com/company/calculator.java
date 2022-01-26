package com.company;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;

        while (true) {
            System.out.print("Enter Your Choice:-");
            char ch = in.next().trim().charAt(0);

            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                System.out.println("Enter Two No:- ");
                int a = in.nextInt();
                int b = in.nextInt();
                if (ch == '+') {
                    ans = a + b;
                }
                if (ch == '-') {
                    ans = a - b;
                }
                if (ch == '*') {
                    if (a != 0 && b != 0) {
                        ans = a * b;
                    }else
                        System.out.println("There is a value 0");
                }
                if (ch == '/') {
                    ans = a / b;
                }
            } else if (ch == 'x' || ch == 'X') {
                break;
            } else {
                System.out.println("Wrong Input");
            }
            System.out.println(ans);
        }
    }
}