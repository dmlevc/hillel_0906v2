package ua.hillel.homework.hm5;

public class Task2 {
    public static void main(String[] args) {
        DimArrayHome();
    }

    public static void DimArrayHome() {
        String[][] star = new String[3][5];
        for (int i = 0; i < star.length; i++) {
            if (i == 0) {
            } else {
                System.out.println();
            }
            for (int k = 0; k < star[i].length; k++) {
                star[i][k] = "*";
                if (k == star[i].length - 1) {
                    System.out.print(star[i][k]);
                } else {
                    System.out.print(star[i][k] + " ");
                }
            }
        }
    }
}