package grabar.Stream_task;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        ArrayList<Integer> number = ArrayFactory.createArray();
        System.out.printf("Массив имеет %d элемента(ов)", number.size());
        System.out.println(" " + number);
        System.out.println("Отсортированный массив: " + ArrayOptions.sort(number));
        System.out.print("Элеметы массива которые меньше 0 " + ArrayOptions.showArray(number));
        System.out.printf(" Количество элементов: %d;\n", ArrayOptions.showArrayCount(number));
        System.out.println("Их индексы!!!???");
        System.out.println("Минимальное значение массива: " + ArrayOptions.min(number));
        System.out.print("Умноженный массив на число M. ");
        System.out.println(ArrayOptions.multiplication(number));
        */


        int[] array = ArrayFactory.createintArray();
        System.out.printf("Массив имеет %d элемента(ов)\n", array.length);
        System.out.println("Среднее значение массива: " + ArrayOptions.averageIntSream(array));
        System.out.println("Минимальное значение массива: " + ArrayOptions.minIntStream(array));

        System.out.println("Индекс минимального значение массива: " + ArrayOptions.minIndexIntSream(array));

        System.out.println("Количество элементов равных 0: " + ArrayOptions.filterZeroIntSream(array));
        System.out.println("Количество элементов больше 0: " + ArrayOptions.filterMoreZeroIntSream(array));
        System.out.print("Массив умноженный на число M. ");
        ArrayOptions.multiplicationIntSream(array);
    }
}
