package ua.hillel.lessons.lesson15.exceptions.customexception;

public class MyException extends Exception{
   private int detail;
   public MyException(String message, int detail){
       super(message);
       this.detail = detail;
   }
}
