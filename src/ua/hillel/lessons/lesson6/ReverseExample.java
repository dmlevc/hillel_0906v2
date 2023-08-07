package ua.hillel.lessons.lesson6;

public class ReverseExample {
    public static void main(String[] args) {
        reverseExamp();
    }

    public static void reverseExamp() {
        String[] str = {"1", "2", "3", "4"};
        //n-i-1
        int n = str.length;
        String temp;

        for (int i = 0; i < n / 2; i++) {
            temp = str[n - i - 1]; //str[4-0-1]     temp= str[3] = Макс
            str[n - i - 1] = str[i]; //Макс = Привет
            str[i] = temp;// Макс = привет

        }
        for (String i : str) {
            System.out.print(i.concat(" "));
        }
    }

    public static void reverseExamp2() {
        String[] str = {"Привет", "меня", "зовут ", "Макс"};
        //n-i-1

        for (int i = str.length - 1; i < str.length / 2; i++) {

        }
        for (String i : str) {
            System.out.println(i.concat(" "));
        }
    }
}