package ua.hillel.homework.hm3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        submitHomeTask3();
    }

    public static void submitHomeTask3() {
        System.out.println("Please enter number 1, 2 or 3");
        Scanner numbers = new Scanner(System.in);
        int number = numbers.nextInt();

        if ((number >= 1) && (number <= 3)) {
            System.out.println("Вы ввели число " + number);
        } else {
            System.out.println("Вы ввели число не равное 1, 2 или 3");
        }

    }
}
