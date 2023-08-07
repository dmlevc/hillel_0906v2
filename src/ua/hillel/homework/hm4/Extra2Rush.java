package ua.hillel.homework.hm4;

// https://javarush.com/quests/lectures/questsyntaxpro.level04.lecture03 задачка
import java.util.Scanner;

public class Extra2Rush {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start = input.nextInt();
        int end = input.nextInt();
        int multiple = input.nextInt();
        int sum = 0;

        for (int i = start; i < end; i++) {

            if (i % multiple != 0) {
                continue;
            }
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
