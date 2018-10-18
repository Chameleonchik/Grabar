package grabar.Homework_1.util;

import java.util.Scanner;

public class Util {
    public static int inputIntValue() {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println("Enter correct concern! Try again!");
            scanner.next();
        }
        return scanner.nextInt();
    }
}