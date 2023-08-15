package ua.hillel.homework.hm3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        submitHomeTask2();
    }
    public static void submitHomeTask2() {
        System.out.println("Please enter the number 1");
        Scanner numberInput = new Scanner(System.in);
        int number = numberInput.nextInt();
        if (number == 1){
            System.out.println("Вы ввели число 1");
        }else{
            System.out.println("Вы ввели число не равное 1");
        }
    }
}
