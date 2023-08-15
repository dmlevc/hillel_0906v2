package ua.hillel.homework.hm3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        submitHomeTask1();
    }
        public static void submitHomeTask1(){

        System.out.println("Please enter two whole numbers");
        Scanner numbers = new Scanner(System.in);
        int number1 = numbers.nextInt();
        int number2 = numbers.nextInt();
        int result = number1 + number2;

        System.out.println("Please enter the name");
        Scanner text = new Scanner(System.in);
        String textLine = text.nextLine();


        System.out.println(textLine + " " + result);
    }
}
