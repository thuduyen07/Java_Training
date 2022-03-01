package com.thuduyen07.C6_ControlFlowStatements;

public class Calculation {
    public static void main(String[] args) {

        /**
         * for loop
         */
        int sum = 0;
        for(int j=1; j<=10; j++){
            sum += j;
        }
        System.out.println("The sum of first 10 natural number is " + sum);

        /**
         * for-each loop
         */
        String[] names = {"Java", "C", "C++", "Python", "JavaScript"};
        System.out.println("Printing the content of the names array:");
        for(String name:names){
            System.out.println(name);
        }

        /**
         * while loop
         */
        int i=1;
        int j=0;
        System.out.println("Printing the list of first 10 even numbers:");
        while(i<=10){
            System.out.println(j);
            j+=2;
            i++;
        }

        /**
         * do while loop
         */
        int k=0;
        System.out.println("Print the list of even number less than 10:");
        do{
            System.out.println(k);
            k+=2;
        }while (k<10);
    }
}
