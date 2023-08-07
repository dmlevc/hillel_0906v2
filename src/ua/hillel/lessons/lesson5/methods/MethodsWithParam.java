package ua.hillel.lessons.lesson5.methods;

public class MethodsWithParam {
    public static void main(String[] args) {
        sum(5,10);
        sayName("Kolya");
        sayName ("Alex");
    }
    public static void sayName(String name){
        System.out.println(name);
    }
    public static void sum(int number1, int number2){
        int result = number1 + number2;
        System.out.println(result);
    }
}
