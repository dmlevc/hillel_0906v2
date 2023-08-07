package ua.hillel.homework.hm6;

public class ReverseLoop {
    public static void main(String[] args) {
        String[] array = {"One", "Two", "Three", "Four", "Five", "Six"};

        int str = array.length;
        String temp;

        for (int i = 0; i < str / 2; i++) {
            temp = array[str - i - 1];
            array[str - i - 1] = array[i];
            array[i] = temp;
        }
        for (String i : array) {
            System.out.print(i.concat(" "));
        }
    }
}