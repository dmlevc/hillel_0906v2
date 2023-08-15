package ua.hillel.homework.hm12;

public class HomeWork {

    public static void main(String[] args) {
        int[] newArray = addNumber(new int[]{1, 2, 3, 4, 5, 6}, 7);

        for (int i : newArray) {
            System.out.print(i + " ");
        }
    }

    public static int[] addNumber(int[] a, int number) {
        int[] newArray = new int[a.length + 1];

        for (int i = 0; i < a.length; i++) {
            newArray[i] = a[i];
        }
        newArray[newArray.length - 1] = number;

        return newArray;
    }
}

