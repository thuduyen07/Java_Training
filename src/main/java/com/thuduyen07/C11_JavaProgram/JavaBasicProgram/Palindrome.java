package com.thuduyen07.C11_JavaProgram.JavaBasicProgram;

import java.util.Scanner;

public class Palindrome {
    static Scanner console = new Scanner(System.in);

    //todo Is there any notation such as Step, Describe, etc. to note these method?

    /**
     * Get user's input from console
     * @return givenValue -- user's input
     */
    private static String getValueToCheck(){
        System.out.print("Please enter value for checking: ");
        String givenValue = console.next();
        return givenValue;
    }

    /**
     * reverse the given value
     * @param givenValue -- value for reversing
     * @return reversedValue -- reversion of given value
     */
    private static String reverseValue(String givenValue){
        String reversedValue = "";
        for(int i=givenValue.length(); i>0;i--){
            reversedValue = reversedValue+givenValue.substring(i-1,i);
        }
        return reversedValue;
    }

    /**
     * Check whether the given value is the same with it's reversed value
     * @param givenValue -- given value
     * @param reversedValue -- reversion of given value
     * @return true if they're the same, false if they're not
     */
    private static boolean compareGivenValueAndReversedValue(String givenValue, String reversedValue){
        if(givenValue.equals(reversedValue)){
            return true;
        } else {
            return false;
        }
    }

    //todo Try with number/10 idea https://www.javatpoint.com/palindrome-program-in-java

    public static void main(String[] args) {
        String testValue = getValueToCheck();
        String reversedTestValue = reverseValue(testValue);
        if(compareGivenValueAndReversedValue(testValue, reversedTestValue)){
            System.out.printf("%s is palindrome", testValue);
        } else {
            System.out.printf("%s is not palindrome", testValue);
        }

    }
}
