package com.thuduyen07.C6_ControlFlowStatements;

public class Student {
    public static void main(String[] args) {

        /**
         * Simple if
         */
        int x = 10;
        int y = 12;
        if(x+y > 20){
            System.out.println("x+y is greater than 20");
        }

        /**
         * if-else statement
         */
        if(x+y < 10){
            System.out.println("x+y is less than 10");
        } else{
            System.out.println("x+y is greater than 20");
        }

        /**
         * if-else-if ladder
         */
        String city = "Da Nang";
        if(city == "HCM"){
            System.out.println("City is HCM");
        } else if(city == "Ha Noi"){
            System.out.println("City is Ha Noi");
        } else{
            System.out.println("City is " + city);
        }

        /**
         * Nested if statement
         */
        String address = "HCM, Vietnam";
        if(address.endsWith("Vietnam")){
            if(address.contains("Ha Noi")){
                System.out.println("Your city is Ha Noi");
            } else if(address.contains("Da Nang")){
                System.out.println("Your city is Da Nang");
            } else{
                System.out.println(address.split(",")[0]);
            }
        } else {
            System.out.println("You are not living in Vietnam");
        }

        /**
         * switch statement
         */
        int month = 24;
        switch(month){
            case 1, 2, 3:
                System.out.println("You are in Spring");
                break;
            case 4, 5, 6:
                System.out.println("You are in Summer");
                break;
            case 7, 8, 9:
                System.out.println("You are in Fall");
                break;
            case 10, 11, 12:
                System.out.println("You are in Winter");
                break;
            default:
                System.out.println("Your month is invalid");
        }
    }
}
