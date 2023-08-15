package ua.hillel.lessons.lesson4.arrays;

public class ArraysExample {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 5};
        String[] arrayStr = {"Alex", "Igor", "Kostya"};
        int arrayLength = array.length;
        System.out.println(arrayLength);
        System.out.println(arrayStr.length);

        System.out.println(arrayStr[1]); // если хотим вывести 2 ячейку в массиве


        int[] array1 = new int[3]; // без инициализации массива
        array1[0] = 10;
        array1[1] = 150;
        array1[2] = 200;

        System.out.println(array1[0]);

        String[] array2 = new String[3];
        System.out.println(array2[0]);

        char[] array3 = new char[3];
        System.out.println(array3[0]);

        int[] array4 = new int[3];
        System.out.println(array4[0]);

        double[] array5 = new double[3];
        System.out.println(array5[0]);

        float[] array6 = new float[3];
        System.out.println(array6[0]);

        boolean[] array7 = new boolean[2];
        System.out.println(array7[0]);


    }
}
