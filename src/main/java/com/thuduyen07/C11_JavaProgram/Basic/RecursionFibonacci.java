package com.thuduyen07.C11_JavaProgram.Basic;

import java.util.ArrayList;
import java.util.List;

public class RecursionFibonacci {
    static int n1 = 0;
    static int n2 = 1;
    static int n3 = 0;
    static List<Integer> fibonacciSequence= new ArrayList<> ();

    static private void calculateFibonacci(int sequenceElementsNumber){
        if(sequenceElementsNumber>0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            fibonacciSequence.add(n3);
            calculateFibonacci(--sequenceElementsNumber);
        }
    }

    public static void main(String[] args) {
        int sequenceElementsNumber = 10;
        fibonacciSequence.add(n1);
        fibonacciSequence.add(n2);
        calculateFibonacci(sequenceElementsNumber-2);
        System.out.println(fibonacciSequence);
    }
}
