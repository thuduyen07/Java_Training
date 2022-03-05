package com.thuduyen07.C11_JavaProgram.Basic;

import java.util.Base64;
import java.util.Scanner;

public class Base {
    static Scanner console = new Scanner(System.in);

    /**
     * Get user's input from console
     * @return givenValue -- user's input
     */
    public static String getStringFromConsole(){
        System.out.print("Please enter a string: ");
        return console.next();
    }

    public static int getIntFromConsole(){
        System.out.print("Please enter a integer: ");
        return console.nextInt();
    }
}
