package com.thuduyen07.C7_IfElseStatement;

import java.util.Scanner;

public class OddEvenNumber {
    public static void main(String[] args) {
        String continueAnswer = null;
        do {
            System.out.print("Please input the number you need to check: ");
            Scanner console = new Scanner(System.in);
            int number = console.nextInt(); //define number

            //check if number is divisible by 2
            if (number % 2 == 0) {
                System.out.printf("%d is even number", number);
            } else {
                System.out.printf("%d is odd number", number);
            }
            System.out.println("\nDo you need to continue?");
            System.out.println("Press Y for continue, press any other button for stop the program");
            continueAnswer = console.next();
        } while(continueAnswer.equals("Y"));
    }
}
