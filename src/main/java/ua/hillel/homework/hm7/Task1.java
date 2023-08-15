package ua.hillel.homework.hm7;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1, num2, operation);

        System.out.println(result);
    }

    public static int getInt() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static char getOperation() {
        Scanner input = new Scanner(System.in);
        return input.next().charAt(0);
    }

    public static int calc(int num1, int num2, char operation) {
        int result;
        switch (operation) {
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;

            default:
                result = 0;
        }
        return result;
    }
}
