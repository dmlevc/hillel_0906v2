package ua.hillel.lessons.lesson6;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слова одной строкой через пробел");
        String str = scanner.nextLine();

        int count = 0;
        if (str.length() != 0) {
            count++;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    count++;
                }
            }
        }
        System.out.println("вы ввели " + count + " слова");


    }
}


