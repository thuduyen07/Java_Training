package com.thuduyen07.JMVArchitecture;

/**
 * Print the classloader name
 */
public class ClassLoaderExample {
    public static void main(String[] args) {
        /**
         * Print the classloader name of current class
         * System classloader will load this class
         */
        Class c = ClassLoaderExample.class;
        System.out.println(c.getClassLoader());

        /**
         * If we print the classloader name of String, it will print null because it is an in-built class which is found in rt.jar, so it is loaded by Bootstrap classloader
         */
        System.out.println(String.class.getClassLoader());
    }
}
