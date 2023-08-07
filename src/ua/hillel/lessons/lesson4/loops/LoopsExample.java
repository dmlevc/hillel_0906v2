package ua.hillel.lessons.lesson4.loops;

public class LoopsExample {
    public static void main(String[] args) {
        forEachExampleWithArrayStr();
    }

    public static void whileExample() {
        int i = 1;
        while (i < 8) {
            System.out.println(i + " ");
            i++;
        }
    }

    public static void whileExample2() {
        int i = 100;
        while (i >= 10) {
            System.out.println(" Обратный отсчёт " + i + " ");
            i -= 10;
        }
    }

    public static void forExample() {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Max");
        }
    }

    public static void forExample1() {
        for (int i = 3; i >= -3; i--) {
            System.out.println(i);
        }
    }
    public static void forExampleWithArray() {
        int[] arr = {2,4,6};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }

    public static void forEachExampleWithArray() {
        int[] arr2 = {2,4,6};
        for (int i : arr2) {
            System.out.println(i);
        }
    }

    public static void forEachExampleWithArrayStr() {
        String[] arrStr = {"Alex","Igor","Kostya"};
        for (String names : arrStr) {
            System.out.println(names + " Surname");
        }
    }
}

