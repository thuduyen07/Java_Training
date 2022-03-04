package com.thuduyen07.C11_JavaProgram.JavaBasicProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Checking whether a number is a prime number
 * Note: using a flag
 * Note: number/2 --- sqrt(number)
 */

public class PrimeNumber {
    public static boolean checkPrimeNumber(int number){
        boolean prime = true; //flag
        if(number==0 || number==1){
            prime = false;
        } else {
            for (int i=2; i<=(number/2); i++){ // how many times calculate i<=(number/2)?
                if(number%i==0){
                    prime = false;
                    break;
                }
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        // Check whether a number is prime number
        System.out.print("Please enter number for checking: ");
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        if (checkPrimeNumber(number)){
            System.out.printf("%d is prime number", number);
        } else {
            System.out.printf("%d is not prime number", number);
        }

        // Find prime numbers between two numbers
        System.out.print("\nPlease enter start number: ");
        int startNumber = console.nextInt();
        System.out.print("Please enter end number: ");
        int endNumber = console.nextInt();
        List<Integer> primeNumberList = new ArrayList<>();
        for(int i=startNumber; i<=endNumber; i++){
            if(checkPrimeNumber(i)){
                primeNumberList.add(i);
            }
        }
        System.out.printf("Prime numbers between %d and %d is: ",startNumber, endNumber);
        System.out.println(primeNumberList);
    }
}
