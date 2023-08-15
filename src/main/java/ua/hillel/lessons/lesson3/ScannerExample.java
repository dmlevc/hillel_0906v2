package ua.hillel.lessons.lesson3;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        method4();
        method3();
        method2();
    }

    public static void method4(){
        System.out.println("Enter any phrase");
        Scanner scannerExample = new Scanner(System.in);
        String phrase = scannerExample.next();
        System.out.println("You enter phrase:" + phrase);

    }

    public static void method3() {
        System.out.println("Enter any phrase");
        Scanner scannerExample = new Scanner(System.in);
        String phrase = scannerExample.nextLine();
        System.out.println("You enter phrase:" + phrase);

    }

    public static void method2() {
        System.out.println("Enter any two digit ");
        Scanner scannerExample = new Scanner (System.in);
        int numberIn1 = scannerExample.nextInt();
        int numberIn2 = scannerExample.nextInt();
        int result = numberIn2 + numberIn2;
        System.out.println(result);


    }
    public static void method1() {

        System.out.println("Enter any digit from 1 to 10");
        Scanner scannerExample = new Scanner(System.in);
        int numberIn = scannerExample.nextInt();
        int result = numberIn +100;
        System.out.println("You enter " + numberIn);
        System.out.println("Result "+ result);
    }
}
