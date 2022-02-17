package com.thuduyen07.C4_JavaVariables;

/**
 * Overflow occurs when we assign such a value to a variable which is more than the maximum permissible value
 */
public class Overflow {
    public static void main(String[] args) {
        int a = 130;

        /**
         * byte: 8-bit signed two's complement integer
         * [-128; 127]
         */
        byte b = (byte) a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
