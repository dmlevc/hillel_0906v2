package ua.hillel.homework.hm4;

import java.util.Scanner;

public class ExtraPractise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        while (input.hasNextInt()) {
            int tmp = input.nextInt();
            if (min > tmp) {
                min = tmp;
            }else if(tmp < min2 && min != tmp){
                min2 = tmp;
            }
        }
        System.out.println(min2);
    }
}
