package com.thuduyen07.C4_JavaVariables;

/**
 * Adding lower datatype than int
 */
public class AddingLowerType {
    public static void main(String[] args) {
        byte a = 120;
        byte b = 10;

        /**
         * Compile time error
         * incompatible types
         * a+b = 10 will be int
         * because if datatype lower than int, they will be converted before calculating so... =))
         */
        //byte c = a+b;

        byte c = (byte)(a+b);
        System.out.println("c = " + c);
    }
}
