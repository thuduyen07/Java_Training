package com.thuduyen07.C11_JavaProgram.JavaBasicProgram;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        List<Integer> fibonacciSequence = new ArrayList<>();
        fibonacciSequence.add(n1);
        fibonacciSequence.add(n2);

        int sequenceElementsNumber = 10;
        for(int i=2; i<sequenceElementsNumber; i++){
            int n3 = n1 + n2;
            fibonacciSequence.add(n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.println(fibonacciSequence);
    }
}
