package com.thuduyen07.C11_JavaProgram.Basic;

import java.util.ArrayList;
import java.util.List;

public class ArmstrongNumber extends Base{

    public static boolean checkArmstrongNumber(int givenNumber){

        if(givenNumber<1) return false;

        // get the number of digit of givenNumber (m)
        String givenNumberString = String.valueOf(givenNumber);
        int digitOfGivenNumber = givenNumberString.length();

        // calculate the sum of the m_th powers of their digits
        int sum = 0;
        for(int i=0; i<digitOfGivenNumber; i++){
            int n = Integer.parseInt(givenNumberString, i, i+1, 10);
            sum += Math.pow(n,digitOfGivenNumber);
        }
        if(sum==givenNumber) return true;

        return false;
    }

    public static void main(String[] args) {
        // Check manually =))
        int givenNumber = getIntFromConsole();
        System.out.println(checkArmstrongNumber(givenNumber));

        // Armstrong number list between 0 and 999
        List<Integer> armstrongList = new ArrayList<>();
        for(int k=0; k<1000; k++){
            if(checkArmstrongNumber(k)){
                armstrongList.add(k);
            }
        }
        armstrongList.stream().forEach(c -> System.out.println(c));
    }
}

// todo check for mathematical solution =)) here https://www.javatpoint.com/armstrong-number-in-java