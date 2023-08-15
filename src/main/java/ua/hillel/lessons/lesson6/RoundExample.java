package ua.hillel.lessons.lesson6;

public class RoundExample {
    public static void main(String[] args) {
        double num = 5.50;

        System.out.println(Math.round(num));  // округляет арифметически. И преобразовывает число в int.
        System.out.println(Math.floor(num)); //округляет вниз
        System.out.println(Math.ceil(num)); //округлять вверх
    }

}
