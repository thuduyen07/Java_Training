package com.thuduyen07.tham_tri_vs_tham_chieu;

public class Foo {
    int value = 20;

    Foo(){};
    void change(int value){
        value += 10;
    }

    public static void main(String[] args) {
        Foo obj = new Foo();

        System.out.println("Before change method: value = " + obj.value);
        obj.change(40); // passing by value (40)
        System.out.println("After change method: value = " + obj.value);
    }
}
