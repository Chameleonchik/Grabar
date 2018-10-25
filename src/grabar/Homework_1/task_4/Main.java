package grabar.Homework_1.task_4;

import grabar.Homework_1.util.Util;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter size:");
        int size = Util.inputIntValue();

        for (int i = 0; i < size; i++) {
            int array[] = new int[i + 1];
            for (int j = i; j > 0; j--) {
                array[i] = j - 1;
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            int array[] = new int[i + 1];
            for (int k = size - 1 - i; k > 0; k--) {
                System.out.print("  ");
            }
            for (int j = i; j > 0; j--) {
                array[i] = j;
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
}