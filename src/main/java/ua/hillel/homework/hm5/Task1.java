package ua.hillel.homework.hm5;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(returnMethod(7,3));
    }

    public static int returnMethod(int number1, int number2) {
        if (number1 > number2) {
            number1 = number2;
        }
        return number1;
    }
}