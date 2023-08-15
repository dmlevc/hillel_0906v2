package ua.hillel.homework.hm6;

import java.sql.SQLOutput;

public class Task2 {
    public static void main(String[] args) {
        for (int i = 1; i <=3; i++) {
            if (i <= 2) {
                System.out.println("Это " + i + "-ый урок!");
                System.out.println("    Я выполнил все домашние задания " + i + "-го урока.");
            }else{
                System.out.println("Это " + i + "-ый урок!");
                System.out.println("    Я не выполнил все домашние задания " + i + "-го урока.");
            }
        }
    }
}
