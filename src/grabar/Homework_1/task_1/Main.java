package grabar.Homework_1.task_1;
import  grabar.Homework_1.util.Util;

public class Main {
        public static void main(String[] args) {
            int count = 0;

            System.out.println("enter number:");
            int a = Util.inputIntValue();
            System.out.println("enter numeral:");
            int b = Util.inputIntValue();
            System.out.println(a + " " + b);
            System.out.println("Numeral " + b + " repeat in number " + a);
            for (int i = 0; i < a; i *= 10) {
                int с = a % 10;
                a /= 10;
                if (с == b) {
                    count++;
                }
            }
            System.out.println(count + " times");
        }
}

