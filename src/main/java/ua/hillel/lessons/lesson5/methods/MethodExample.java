package ua.hillel.lessons.lesson5.methods;

public class MethodExample {
    public static void main(String[] args) {
        System.out.println(returHelloImper());
        String sayHello = returHelloDeklar();
        System.out.println(sayHello);
        System.out.println(plus());
    }

    public static int plus() {
        int result = 2 + 2;
        return result;
    }

    public static int plusDeclar() {
        return 2 + 2;
    }

    public static String returHelloImper() {
        String helloStr = "Hello";
        return helloStr;
    }

    public static String returHelloDeklar() {
        return "hello";

    }

    public static void sayHello() {
        System.out.println("Hello");
    }
}


