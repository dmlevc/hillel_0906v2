package ua.hillel.lessons.lesson7.switchinjava;

public class SwitchJava7 {
    public static void main(String[] args) {
        //java7 принесла работу со стрингой
        int month= 3;

        String monthString;

        switch(month){
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 7:
                monthString = "July";
                break;
            default:
                monthString = "Unknown month";
        }

    }
}
