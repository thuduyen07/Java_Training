package com.thuduyen07.C11_JavaProgram.Basic.ObjectClass;

public class HashCode {
    public static void main(String[] args) {
        Employee employee1 = new Employee(12345, "thuduyen");
        Employee employee2 = new Employee(12345, "thuduyen");

        int a = employee1.hashCode();
        int b = employee2.hashCode();
        System.out.println("Employee1's hashcode: " + a);
        System.out.println("Employee2's hashcode: " + b);

        // java object equals(): false
        // override equals(): true
        System.out.println(employee1.equals(employee2));
        System.out.println(employee1==employee2); //false
    }

}
