package ua.hillel.lessons.lesson12;

public class AboutBreak {
    public static void main(String[] args) {
       for (int i =1; i <=3; i++){
           System.out.println("Это первый цикл. Выполняется " + i + " раз");
           for (int k =1; k<=10; k++){
               int x = 0;
               System.out.println(x++  +"Это второй цикл. Выполняется " +  k + " раз");
               if (k==2){
                   break;
               }
           }
       }
    }




    public static void breakExample1() {
        int a = 1;
        int b = 3;

        while (a <= 5) {
            System.out.println(a + " итерация цикла");
            if (a==b){
                break;
            }
            a++;
        }
    }
}
