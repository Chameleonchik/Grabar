package grabar.Stream_task;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayFactory {
    public static int inputIntValue() {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println("Введено не корректно! Повторите снова!");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static double inputDoubleValue() {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextDouble()) {
            System.out.println("Введено не корректно! Повторите снова!");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    public static ArrayList<Integer> createArray() {
        System.out.println("Введите размер массива:");
        int sizeArray = inputIntValue();
        ArrayList<Integer> number = new ArrayList<>();
        for (int i = 0; i < sizeArray; i++) {
            number.add((int) (Math.random() * 100 - 20));
        }
        return number;
    }

    public static int[] createintArray(){
        System.out.println("Введите размер массива:");
        int sizeArray = inputIntValue();
        int [] array = new int [sizeArray];
        for(int i = 0; i < sizeArray; i++){
            array[i] = (int) (Math.random() * 100 - 20);
            System.out.print(array[i] + " ");

        }
        System.out.println();
        return array;
    }
}
