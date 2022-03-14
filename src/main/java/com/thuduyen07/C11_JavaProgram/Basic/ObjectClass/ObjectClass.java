package com.thuduyen07.C11_JavaProgram.Basic.ObjectClass;

public class ObjectClass {
    public static void main(String[] args) {

        /**
         * equals() -- compare two objects
         * equal -- have same state
         * identical -- share the class identity
         */
        Double x = new Double(123.456);
        Double z = new Double(123.456);
        System.out.println(x.hashCode());
        System.out.println(z.hashCode());
        System.out.println(x.equals(z)); // true -- compare two objects -- hashcode
        System.out.println(z==x); //false -- compare two references - a reference is a variable that refers to an object and using which we can utilize the properties and functions of an object
    }
}
