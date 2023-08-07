package ua.hillel.homework.hm9;

public class Task1 {

    public static void main(String[] args) {


        String[] array = new String[10];
        for (int i = 0; i < 10; i++) {
            array[i] = String.valueOf(i + 1);
            if (Integer.parseInt(array[i]) % 2 == 0) {
                array[i] = "Y";
            }
            System.out.print(array[i] + " ");
        }
    }
}

