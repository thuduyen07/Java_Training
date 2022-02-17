package com.thuduyen07.C4_JavaVariables;

/**
 * Narrowing: converting a higher datatype to a lower datatype
 */
public class Narrowing {
    public static void main(String[] args) {
        float f = 10.5f; // if don't have f, it is double type

        /**
         * Compile time error
         * incompatible types
         */
        //int a = f;

        int a = (int) f;
        System.out.println("f = " + f);
        System.out.println("a = " + a);
    }
}
