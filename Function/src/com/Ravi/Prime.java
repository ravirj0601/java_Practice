package com.Ravi;

import java.util.Scanner;

public class Prime {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter The number to check the number is prime or not");
        int n = in.nextInt();
        if (isPrime(n)) {
            System.out.println("it's Prime No.");
        }else{
            System.out.println("It's not Prime No.");
        }
    }

    private static boolean isPrime(int n) {
        if (n > 0) {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            }
        return true;
    }
}
