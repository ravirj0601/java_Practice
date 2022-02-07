package com.Ravi;

import java.util.Scanner;

public class AreaAndCircumstance {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter The Radius of the Circle:- ");
        double r = input.nextDouble();
        System.out.println("the Area of the circle is " + area(r));
        System.out.println("The Circumstance of circle is " + circumstance(r));
    }

    private static double circumstance(double r) {
        return 2 * Math.PI * r;
    }

    private static double area(double r) {
        return Math.PI * Math.sqrt(r);

    }
}
