package com.Ravi;

public class FunOverloading {
    public static void main(String[] args) {
    fun(56);
    fun("Ravi Ranjan Rajak");
    }
    static void fun(int a){
        System.out.println("First " + a);
    }
     static void fun(String name){
         System.out.println("Second " + name);
    }
}
