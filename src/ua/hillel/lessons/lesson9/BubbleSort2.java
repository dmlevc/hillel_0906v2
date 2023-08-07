package ua.hillel.lessons.lesson9;

import java.util.Arrays;

public class BubbleSort2 {
    public static void main(String[] args) {
        int mas[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        int a, b, t;
        int s = mas.length;
        System.out.println("First array:" + Arrays.toString(mas));


        for (a = 1; a < s; a++) {
            for (b = s - 1; b >= a; b--) {
                if (mas[b] < mas[b - 1]) {
                    t = mas[b];
                    mas[b] = mas[b - 1];
                    mas[b - 1] = t;
                }
            }
            System.out.println("Steps array:" + Arrays.toString(mas));
        }

    }
}

