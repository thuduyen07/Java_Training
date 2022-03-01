package com.thuduyen07.C7_IfElseStatement;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.print("Please enter the year you wanna check:");
        Scanner console = new Scanner(System.in);
        int year = console.nextInt();
        if(((year%4==0)&&(year%100!=0)) || (year%400==0)){
            System.out.printf("%d is leap year", year);
        } else {
            System.out.printf("%d is common year", year);
        }
    }
}
