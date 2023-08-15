package ua.hillel.homework.hm12;

public class Task1 {
    public static void main(String[] args) {
        makingHomeWork(new int[]{1, 2, 3, 4, 5, 6}, 11);


    }

    public static int[] makingHomeWork(int[] a, int b) {
        for (int i = 0; i < a.length; i++) {
            a[a.length-1] = b;
            System.out.print(a[i] + " ");

        }
        return a;
    }
}
