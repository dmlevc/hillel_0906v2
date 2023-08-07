package ua.hillel.homework.hm6;

public class Task1 {


    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <= 5; k++) {
                if (k > 5 - i) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void arrayPrint() {
        String[][] array = new String[3][5];
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++) {
                if (i >= k) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void loopPrint() {
        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <= 5; k++) {
                if (k > 5 - i) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
//   [0][0][0][1][0][2][0][3][0][4]                        1/1,  1/2, 1/3, 1/4, 1/5
//   [1][0][1][1][1][2][1][3][1][4]                        2/1,  2/2, 2/3, 2/4, 2/5
//   [2][0][2][1][2][2][2][3][2][4]                        3/1,  3/2, 3/3, 3/4, 3/5
//   [3][0][3][1][3][2][3][3][3][4]                        4/1,  4/2, 4/3, 4/4, 4/5
//   [4][0][4][1][4][2][4][3][4][4]                        5/1,  5/2, 5/3, 5/4, 5/5