package com.Ravi;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
     fun(1,2,3,4,3,2,43,45,2,6,6);
    multiArg(3,6,"ravi","thut","nahfy");
    }
    static void multiArg(int a,int b,String ...v){

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
