package com.Ravi;

import java.util.Scanner;
//with recursion...
public class Facto {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter A Number :-  ");
        int n = in.nextInt();
        System.out.println("The Factorial of the " + n + " is :- " + getFact(n));

    }
    private static int getFact(int n){
        if (n == 0) {
            return 1;
        }
        return n * getFact(n-1);
    }
}
