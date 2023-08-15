package ua.hillel.lessons.lesson11.superwithconstructor;

public class B extends A{
    public B(){
        System.out.println("В – метод построения без параметров");
    }
    public B(int value){
        super(99);
        System.out.println("В – Метод построения А с параметром " + value);
    }
}
