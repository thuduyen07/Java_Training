package com.thuduyen07.C7_IfElseStatement;

/**
 * Odd and Even Number using if else ternary
 */
public class IfElseTernary {
    public static void main(String[] args) {
        int number=13;
        String output = (number%2==0) ? "even number" : "odd number";
        System.out.printf("%d is %s", number, output);
    }
}
