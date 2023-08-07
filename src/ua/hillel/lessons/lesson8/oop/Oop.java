package ua.hillel.lessons.lesson8.oop;

import ua.hillel.lessons.lesson8.oop.inheritance.Lion;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Oop extends Cat {   //класс ООП является наследником Cat (родительский класс, базовый)
    public static void main(String[] args) {

        //stack    //heap

        sayHello();
        System.out.println(color);
        Lion lion = new Lion();
        lion.walk();
    }
}
