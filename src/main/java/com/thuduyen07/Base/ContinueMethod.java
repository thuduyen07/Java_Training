package com.thuduyen07.Base;

import java.util.Scanner;

public class ContinueMethod {
    public void continueMethod(Scanner console){
        String continueAnswer = null;
        do {
            System.out.println("Please press y to continue, press any other key to stop.\nDo you wanna continue? ");
            continueAnswer = console.next();
            //wanna call another method here
        }while(continueAnswer.equals("y"));
    }
}
