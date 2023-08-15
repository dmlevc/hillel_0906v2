package ua.hillel.homework.hm6;

import java.util.Arrays;

public class ReverseLoopPr2 {
    public static void main(String[] args) {
        String[][] array = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}, {"10", "11", "12"}, {"13", "14", "15"}, {"16", "17", "18"}}; // объявление и инициализация двумерного массива
        int n = array.length;   // создание переменной и инициализация её значения равной количестве строк в массиве
        String temp;           // создание временной переменной для использования её в массиве, в качестве временного хранилища значения индекса начиная с [0][0] в массиве
        for (int i = 0; i < n / 2; i++) { /* создание внешнего цикла (будет 1 внутренний и один внешний), для перебора строк в массиве. Деление n на 2 выполняется для того, чтобы определить половину количества строк в массиве.
          Цикл for выполняется до половины количества строк в массиве. Это сделано для того, чтобы перестановка элементов массива происходила только до центральной строки. Поскольку при перестановке элементов строки i с элементами строки n - i - 1, мы фактически меняем элементы с одной стороны массива на элементы с противоположной стороны, и мы хотим ограничиться только верхней половиной массива, чтобы избежать повторных перестановок и возвращения к исходному состоянию.
          Деление n на 2 позволяет выполнить реверс элементов только для верхней половины массива, исключая центральную строку.*/
            int v = array[i].length;  //строка int v = array[i].length; позволяет получить длину строки array[i] и сохранить ее в переменной v, чтобы использовать эту информацию в последующих операциях внутреннего цикла. Переменная v используется для хранения длины текущей строки array[i]
            for (int k = 0; k < v; k++) { //внутри цикла, операции, указанные внутри фигурных скобок {...}, будут выполняться для каждого элемента строки array[i] по индексу k. Это позволяет обрабатывать элементы строки один за другим в заданном порядке.
                temp = array[i][k];// инициализируем, записываем в переменную temp значение находящееся в индексе массива начиная с[0][0]
                array[i][k] = array[n - i - 1][v - k - 1]; //записываем в индекс массива начиная с [0][0] значения из противоположного индекса
                array[n - i - 1][v - k - 1] = temp; //записываем в индекс, значения из которого уже переписали, значение из сохраненной ранее временной переменной
            }
        }
        if (array.length % 2 != 0) { //написанное условия, при котором будет отрабатывать при четном и нечетном количестве строк в массиве. Без данного условия, будет перебирать вторично массив
            int centerIndex = n / 2; //Здесь переменная centerIndex вычисляет индекс центральной строки в массиве. n представляет собой количество строк в массиве, а centerIndex вычисляется как половина этого значения.
            int centerLength = array[centerIndex].length; //Эта строка определяет длину центральной строки массива. Она получает длину строки array[centerIndex] и сохраняет ее в переменной centerLength.
            for (int k = 0; k < centerLength / 2; k++) {
                temp = array[centerIndex][k];
                array[centerIndex][k] = array[centerIndex][centerLength - k - 1];
                array[centerIndex][centerLength - k - 1] = temp;
            }
        }

        for (int j = 0; j < array.length; j++) {
            for (int l = 0; l < array[j].length; l++) {
                System.out.print(array[j][l] + " ");
            }
            System.out.println();
        }

    }
}

