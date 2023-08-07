package ua.hillel.homework.hm5;

import java.util.Arrays;

//https://javarush.com/quests/lectures/questsyntaxpro.level04.lecture04
public class TreeAllVariants {
    public static void main(String[] args) {
        treePlusOneStarsInArray();
    }

    //равноугловой триугольник
    public static void Int() {
        for (int i = 0; i < 10; i++) {
            int starCount = 10 - i;
            for (int j = 10; j > starCount; j--)
                System.out.print("*");
            System.out.println();
        }
    }

    // елочка с помощью двух массивов и без выведение цикла
    public static void treePlusOneStar() {
        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <= 5; k++) {
                if (k > 5 - i) {
                    System.out.print(" *");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void treePlusOneStarsInArray() {
        int height = 5; // высота ёлочки
        char[][] tree = new char[height][];
        // Заполняем массив tree символами пробела
        for (int i = 0; i < height; i++) {
            tree[i] = new char[2 * height - 1];
            for (int j = 0; j < 2 * height - 1; j++) {
                tree[i][j] = ' ';
            }
        }
        // Рисуем звезды на массиве tree
        for (int i = 0; i < height; i++) {
            for (int j = height - i - 1; j <= height + i - 1; j += 2) {
                tree[i][j] = '*';
            }
        }
        // Выводим ёлочку в консоль
        for (char[] row : tree) {
            for (char symbol : row) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }


    public static void treePlusTwoStars() {
        int height = 5; //Мы инициализируем переменную height со значением 5, которая определяет высоту ёлочки

        int spaces = height - 1; //Переменной spaces присваивается значение height - 1, чтобы определить количество пробелов перед звездочками в каждой строке.
        int stars = 1; // Переменной stars присваивается начальное значение 1, которое определяет количество звездочек в первой строке.

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < stars; k++) {
                System.out.print("*");
            }

            System.out.println();

            spaces--;
            stars += 2;
        }
    }

    public static void treePlusTwoStarArray() {
        int height = 5;
        char[][] tree = new char[height][];

        for (int i = 0; i < height; i++) {
            int numSpaces = height - i - 1;
            int numStars = 2 * i + 1;

            tree[i] = new char[numSpaces + numStars];
            Arrays.fill(tree[i], ' ');
            Arrays.fill(tree[i], numSpaces, numSpaces + numStars, '*');

            System.out.println(tree[i]);
        }
    }

    public static void treePlusTwoStarsArray2() {
        int height = 5;
        char[][] tree = new char[height][];

        for (int i = 0; i < height; i++) {
            int numSpaces = height - i - 1;
            int numStars = 2 * i + 1;

            tree[i] = new char[numSpaces + numStars];

            // Заполнение пробелами
            for (int j = 0; j < numSpaces; j++) {
                tree[i][j] = ' ';
            }

            // Заполнение звездочками
            for (int k = numSpaces; k < numSpaces + numStars; k++) {
                tree[i][k] = '*';
            }

            System.out.println(tree[i]);
        }
    }


}

