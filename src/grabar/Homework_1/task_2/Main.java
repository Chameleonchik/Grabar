package grabar.Homework_1.task_2;

import grabar.Homework_1.util.Util;

public class Main {
    public static void main(String[] args) {
        int sum = 0;

        System.out.println("Enter array length: ");
        int size = Util.inputIntValue();
        int array[] = new int[size];
        System.out.println("Insert array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = Util.inputIntValue();
            sum += array[i];
        }

        int max = array[0], min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        double avarage = sum / size;
        System.out.println("Amount of elements: " + size);
        System.out.println("Min number of array: " + min);
        System.out.println("Max number of array: " + max);
        System.out.println("Avarage number of array: " + avarage);
    }
}
