package com.thuduyen07.C11_JavaProgram.Basic;

public class ObjectClass {
    public static void main(String[] args) {

        /**
         * equals() -- compare two objects
         * equal -- have same state
         * identical -- share the class identity
         */
        Double x = new Double(123.456);
        Double z = new Double(123.456);
        System.out.println(x.equals(z)); // true -- compare two objects
        System.out.println(z==x); //false -- compare two references
    }
}
