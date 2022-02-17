package com.thuduyen07.JavaVariables;

public class VariablesTypes {
    static int m = 100; // static variable

    void method(){
        int n = 90; //local variable
        System.out.println("n = " + n);
    }

    public static void main(String[] args) {
        int data = 50; // instance variable
        System.out.println("data " + data);

        VariablesTypes variablesTypes = new VariablesTypes();
        System.out.println("m = " + m);

        variablesTypes.method();
    }
}
