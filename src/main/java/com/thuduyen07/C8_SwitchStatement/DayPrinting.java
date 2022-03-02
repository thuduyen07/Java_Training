package com.thuduyen07.C8_SwitchStatement;

public class DayPrinting {
    public enum Day {Mon, Tue, Wed, Thu, Fri, Sat, Sun}

    public static void main(String[] args) {
        for(Day now : Day.values()){
            switch(now){
                case Mon -> System.out.println("Monday");
                case Tue -> System.out.println("Tuesday");
                case Wed -> System.out.println("Wednesday");
                case Thu -> System.out.println("Thusday");
                case Fri -> System.out.println("Friday");
                case Sat -> System.out.println("Saturday");
                case Sun -> System.out.println("Sunday");


            }
        }
    }
}
