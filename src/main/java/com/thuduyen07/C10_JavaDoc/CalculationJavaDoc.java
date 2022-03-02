package com.thuduyen07.C10_JavaDoc;
import java.io.*;

/**
 * This class is the sample for java doc
 * run javac CalculationJavaDoc.java for compiling
 * run java CalculationJavaDoc for creating doc
 * run javadoc CalculationJavaDoc.java for creating doc api
 */
public class CalculationJavaDoc {
    /**
     * This method calculates the summation of two integers
     * @param number1 is the first parameter to sum() method
     * @param number2 is the second parameter to sum() method
     * @return the summation of number1 and number2
     */
    public int sum(int number1, int number2){
        return number1 + number2;
    }

    /**
     * The main method uses sum() method
     * @see java.io.IOException
     */
    public static void main(String[] args) {
        CalculationJavaDoc cal = new CalculationJavaDoc();
        int number1 = 20;
        int number2 = 80;
        int result = cal.sum(number1, number2);
        System.out.printf("%d + %d = %d", number1, number2, result);
    }
}
