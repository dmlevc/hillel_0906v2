package ua.hillel.homework.hm8;

public class Task1 {
    public static void main(String[] args) {

        int[] temp = new int[10];
        int sum = 0;
        int iterations = 0;


        for (int i = 0; i < 10; i++) {

            temp[i] = (int) (Math.random() * 11 + 10);;
            sum = temp[i] + sum;
            iterations++;

        }
        System.out.println("Средне арифметическое число = " + (Double.valueOf(sum) / Double.valueOf(iterations)));
    }
}
