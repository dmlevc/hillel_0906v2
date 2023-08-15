package ua.hillel.lessons.lesson11.superwithconstructor;

import java.lang.reflect.Constructor;

public class A {
    public A(){
        System.out.println("А – метод построения без параметров");
    }
    public A(int value){
        System.out.println("А – Метод построения А с параметром " + value);
    }
}
