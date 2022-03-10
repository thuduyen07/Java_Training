package com.thuduyen07.C11_JavaProgram.Basic;

public class Palindrome extends Base {



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

    // todo use try catch to handle integer overflow --> recommend to use "check palindrome string" method
    private static boolean checkPalindromeNumber(){
        System.out.print("\nPlease enter a number you need to check: ");
        int givenNumber = console.nextInt();
        int reversedNumber = 0;
        int quotient = givenNumber;
        while(quotient!=0){
            int remainder = quotient%10; //difficult part =)) -- before quotient change
            quotient = quotient/10;
            reversedNumber = reversedNumber*10 + remainder; //difficult part =)) -- do not use pow
        }
        if(givenNumber==reversedNumber){
            System.out.printf("%d is palindrome number", givenNumber);
            return true;
        }
        System.out.printf("%d is not palindrome number", givenNumber);
        return false;
    }

    public static void main(String[] args) {

        //Check whether any string is palindrome
        String testValue = getStringFromConsole();
        String reversedTestValue = reverseValue(testValue);
        if(compareGivenValueAndReversedValue(testValue, reversedTestValue)){
            System.out.printf("%s is palindrome", testValue);
        } else {
            System.out.printf("%s is not palindrome\n", testValue);
        }

        // Check whether any number is palindrome number
        checkPalindromeNumber();
    }
}

// https://www.javatpoint.com/palindrome-program-in-java