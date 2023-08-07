package ua.hillel.homework.hm4;

public class Task4 {
    public static void main(String[] args) {
        int numberInitial = 1;
        while (numberInitial <= 512) {
            System.out.print(numberInitial + " ");
            numberInitial *= 2;
        }
    }
}
