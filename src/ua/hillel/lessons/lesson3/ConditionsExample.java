package ua.hillel.lessons.lesson3;

public class ConditionsExample {
    public static void main(String[] args) {
        method2();
    }
    public static void method2() {
        int a = 7;
        int b = 6;
        if (a==b){
            System.out.println("digits are same");
        }else if (a > b){
            System.out.println("a bigger than b");
        }else{
            System.out.println("a less than b");
        }
    }

    public static void method(){
        int a = 6;
        int b = 7;
        if (a==b){
            System.out.println("digits are same");
        }else {
            System.out.println("digits are not same");
        }
    }
}
