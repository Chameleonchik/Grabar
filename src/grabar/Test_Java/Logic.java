package grabar.Test_Java;

import java.util.Scanner;

public class Logic {

    public static void HelloWorld(){
        System.out.println("Hello_World");
    }

    public static int sum1(int a, int b){
        return a+b;
    }

    public double sum2(double a, double b){
        return a+b;
    }

    public static void Letter(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше послание:");
        String a = scanner.next();
        System.out.println(a);


    }
}
