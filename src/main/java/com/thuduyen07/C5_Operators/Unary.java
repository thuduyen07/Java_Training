package com.thuduyen07.C5_Operators;

/**
 * Java Unary Operator: ++ and --, ~ and !,
 */
public class Unary {
    public static void main(String[] args) {
        /**
         * ++ and --
         */
        System.out.println("Example for ++ and --");
        int x = 10;
        System.out.println("x++ = " + x++); //print 10 then x=10+1
        System.out.println("++x = " + ++x); //x=11+1 then print 12
        System.out.println("x-- = " + x--); // print 12 then x=12-1
        System.out.println("--x = " + --x); //x=11-1 then print 10

        /**
         * ~ and !
         */
        System.out.println("Example for ~ and !");
        int a = 10;
        int b = -8;
        boolean c = true;
        boolean d = false;
        System.out.println("~a = " + ~a);
        System.out.println("~b = " + ~b);
        System.out.println("!c = " + !c);
        System.out.println("!d = " + !d);
    }
}
