package com.thuduyen07.tham_tri_vs_tham_chieu;

public class MyClass {
    public static void main(String[] args) {
        Person person = new Person("John");
        person.setAge(20);
        celebrateBirthday(person); // passing by reference (person)

        System.out.println(person.getAge());
    }

    static void celebrateBirthday(Person p){
        p.setAge(p.getAge() + 1);
    }
}
