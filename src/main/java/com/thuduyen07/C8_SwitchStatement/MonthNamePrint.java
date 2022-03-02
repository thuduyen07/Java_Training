package com.thuduyen07.C8_SwitchStatement;

import java.util.Scanner;

/**
 * Print the name of month for the given number
 */
public class MonthNamePrint {
    public static void main(String[] args) {
        String continueAnswer = null;
        do {
            System.out.print("Please enter the number for printing month name: ");
            Scanner console = new Scanner(System.in);
            int number = console.nextInt();

            String month = null;
            switch (number){
                case 1: month = "January";
                    break;
                case 2: month = "February";
                    break;
                case 3: month = "March";
                    break;
                case 4: month = "April";
                    break;
                case 5: month = "May";
                    break;
                case 6: month = "June";
                    break;
                case 7: month = "July";
                    break;
                case 8: month = "August";
                    break;
                case 9: month = "September";
                    break;
                case 10: month = "October";
                    break;
                case 11: month = "November";
                    break;
                case 12: month = "December";
                    break;
                default:
                    System.out.println("Invalid number. \nPlease enter the number from 1 to 12.");
            }
            System.out.printf("%d is %s", number, month);
            System.out.println("\nPress Y for continuing, press any other key for stop the program.\nDo you wanna continue? ");
            continueAnswer = console.next();
        } while(continueAnswer.equals("Y"));
    }
}
