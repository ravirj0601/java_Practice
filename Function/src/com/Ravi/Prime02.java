package com.Ravi;

import java.util.ArrayList;
import java.util.Scanner;

public class Prime02 {
    static Scanner in  = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter Two Numbers :- ");
        int first = in.nextInt();
        int second = in.nextInt();
//        ArrayList<Integer> arr = new ArrayList<>();
//        arr = ;
//        System.out.println(primeNos(first,second));
//        primeNos(first,second);
        for (int i = first; i <= second ; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
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
//    private static void primeNos(int first, int second) {
////        ArrayList<Integer> pr = new ArrayList<>();
//        for(int j = first;j <= second;j++) {
//            for (int i = 2; i < j; i++) {
//                if (i % j == 0) {
//                    break;
//                } else {
////                    pr.add(j);
//                    System.out.println(j);
//                }
//            }
//        }
//        return pr;
}

