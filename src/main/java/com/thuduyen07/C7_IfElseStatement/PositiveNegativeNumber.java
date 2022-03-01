package com.thuduyen07.C7_IfElseStatement;

import java.util.Scanner;

public class PositiveNegativeNumber {
    public static void main(String[] args) {
        System.out.print("Please enter the number you wanna check: ");
        Scanner console = new Scanner(System.in);
        double number = console.nextDouble();
        if(number>0){
            System.out.printf("%f is positive number", number);
        } else if(number==0){
            System.out.println("It's zero");
        } else{
            System.out.printf("%f is negative number", number);
        }
    }
}
