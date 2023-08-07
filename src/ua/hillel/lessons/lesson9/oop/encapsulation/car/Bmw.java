package ua.hillel.lessons.lesson9.oop.encapsulation.car;

import ua.hillel.lessons.lesson9.oop.encapsulation.specific.Specification;

public class Bmw {
    public static void main(String[] args) {
        Specification spc = new Specification();
        spc.color();
        System.out.println(spc.fuel);
    }
}
