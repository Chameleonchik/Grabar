package grabar.Homework_1.task_3;

import grabar.Homework_1.util.Util;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter start Capital:");
        double startCapital = Util.inputIntValue();
        System.out.println("Enter persent:");
        double persent = Util.inputIntValue();
        System.out.println("Enter finish Capital:");
        double finishCapital = Util.inputIntValue();
        int years = 0;
        /**
         * Loop while;
         */
        while (startCapital <= finishCapital) {
            years++;
            startCapital += startCapital * (persent / 100);
        }

        /**
         * Loop while with break;
         */

//        while (true) {
//           years++;
//            startCapital += startCapital * (persent / 100);
//            if (startCapital >= finishCapital) {
//                break;
//            }
//        }
        /**
         * Loop while with break and label;
         */
//        OUTER:
//        while (true) {
//            years++;
//            startCapital += startCapital * (persent / 100);
//            if (startCapital >= finishCapital) {
//                break OUTER;
//            }
//        }
        /**
         * Loop do-while; We can use it cause we have condition that
         * startCapital cant be more than finishCapital;
         */
//        do {
//            years++;
//            startCapital += startCapital * (persent / 100);
//        } while (startCapital <= finishCapital);
        /**
         * Loop for with break;
         */
//        for (; ; ) {
//            years++;
//           startCapital += startCapital * (persent / 100);
//           if (startCapital >= finishCapital) {
//                break;
//            }
//        }
        System.out.println("After " + years + " you have finishCapital");
    }
}
