package com.thuduyen07.C7_IfElseStatement;

import java.util.Scanner;

public class DonateBloodConditionChecking {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Checking donate blood condition program \nPlease enter your age: ");
        int age = console.nextInt();
        System.out.print("Please enter your weight: ");
        int weight = console.nextInt();
        if(age>18){
            if(weight>50){
                System.out.println("You are eligible to donate blood");
            } else {
                System.out.println("Your weight must be greater than 50");
            }
        } else{
            System.out.println("Your age must be greater than 18");
        }
    }
    //todo continue with this link: https://www.javatpoint.com/java-switch
}
