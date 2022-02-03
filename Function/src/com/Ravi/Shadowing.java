package com.Ravi;

public class Shadowing {
    static int x; //class variable.
    public static void main(String[] args) {
        System.out.println(x);
        int x;
        //System.out.println(x); **scope will begin when value is initialize.
        x= 29; //it will override the x which is initialized outside these main function.

        System.out.println(x);
    }
    static void tum(){
        System.out.println(x);
    }
}
