package ua.hillel.lessons.lesson8.oop.polyforphism;

public class PolymorphismExample {
    //Overload
    //Override
    public static void main(String[] args) {
        System.out.println(add());
        System.out.println(add());
        System.out.println(add());
        System.out.println(add());

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static String add(String a, String b) {
        return a + b;
    }

    public static String add() {
        return "a" + "b";
    }

    public static int add(int a) {
        return a + 6;
    }
}
