package com.thuduyen07.C9_Loop;

public class InvertedPyramid {
    public static void main(String[] args) {
        int pyramidHeight = 5;
        for(int i=0; i<pyramidHeight; i++){
            for(int j=pyramidHeight; j>i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

