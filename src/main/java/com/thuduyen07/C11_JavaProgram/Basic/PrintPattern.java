package com.thuduyen07.C11_JavaProgram.Basic;

public class PrintPattern {

    public static void printRightTriangle(int rowNumber) {
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printInvertedLeftTriangle(int rowNumber) {
        for (int i = rowNumber; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printLeftTriangle(int rowNumber) {
        for (int i = 1; i <= rowNumber; i++) {
            for (int j = 1; j <= rowNumber; j++) {
                if (j < (rowNumber - i + 1)) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void printMyPyramid(int rowNumber) {
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 1; j <= rowNumber + i; j++) {
                if (j >= rowNumber - i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void printMyInvertedParymid(int rowNumber) { // tu nhien no chay dc, hong hiu minh viet gi luon =((
        for (int i = 0; i < rowNumber; i++) {
            for (int j = -1; j <= rowNumber + 1 - i; j++) {
                if (j >= i-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void printDiamond(int rowNumber) { //hong giong =((
        printMyPyramid(rowNumber/2);
        printMyInvertedParymid(rowNumber/2);
    }

    public static void printOtherPyramid(int rowNumber) { //printRightTriangle and insert blank space before those stars =)) -- khos vl =((
        for (int i = 0; i < rowNumber; i++) {
            // Insert blank space before stars
            for (int j = rowNumber - i; j > 0; j--) {
                System.out.print(" ");
            }
            // Draw stars =))
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        printDiamond(8);
    }
}

// https://www.javatpoint.com/java-programs#java-basic-programs -- toi cai diamond thieu hang giua a =((