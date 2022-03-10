package com.thuduyen07.C11_JavaProgram.Basic;

public class Factorial extends Base{

    private static int loopFactorial(int givenNumber){
        System.out.println("------- Loop Factorial -------");
        int factorial = 1;
        if(givenNumber<0){
            System.out.printf("Sorry, %d is negative number.", givenNumber);
            return -1;
        } else {
            for (int i = givenNumber; i > 0; i--) {
                factorial *= i;
            }
        }
        System.out.printf("Factorial of %d is %d", givenNumber, factorial);
        return factorial;
    }

    private static int recursionFactorial(int givenNumber){
        int factorial = 1;
        if(givenNumber>0){
            return recursionFactorial(givenNumber-1)*givenNumber;
        }
        return factorial;
    }

    public static void main(String[] args) {
        int givenNumber = getIntFromConsole();
        loopFactorial(givenNumber);
        System.out.printf("Factorial of %d is %d", givenNumber, recursionFactorial(givenNumber));
    }
}

// https://www.javatpoint.com/factorial-program-in-java