package com.Ravi;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 45;
        {
            /*int a = 10;we can't initialize a variable inside which
            is already initialize outside  */
            a = 100;/*But we can manipulate it in inside Scope
             and the changes will remain even outside the Scope*/
            int c = 100;
        }
        //System.out.println(c); we can't access the initialized variable inside Scope
        int c = 67; //But we can initialize it again outside that Scope
        //scoping in for loop
        for (int i = 0; i < 19 ; i++) {
            int n = 100;/*whatever we initialize in the for loop body
                    it will be work here only  */
        }

    }
}
