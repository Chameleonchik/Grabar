package grabar.Stream_task;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayOptions {
    /**
    ArrayList<Integer>
    */
    public static ArrayList<Integer> showArray(ArrayList<Integer> number) {

        return (ArrayList<Integer>) number.stream()
                .filter(num -> num < 0)
                .collect(Collectors.toList());
    }

    public static ArrayList<Integer> sort(ArrayList<Integer> number) {

        return (ArrayList<Integer>) number.stream()
                .sorted()
                .collect(Collectors.toList());
    }

    public static int showArrayCount(ArrayList<Integer> number) {

        return (int) number.stream()
                .filter(num -> num < 0)
                .count();
    }

    public static Integer min(ArrayList<Integer> number) {

        return number.stream()
                .min(Integer::compareTo).get();
    }

    public static ArrayList<Double> multiplication(ArrayList<Integer> number, double numbe) {
        return (ArrayList<Double>) number.stream()
                .map(num -> num * numbe)
                .collect(Collectors.toList());
    }


    /**
     * Arrays.stream()
     */

    public static double average(int[] array) {

        return Arrays.stream(array).average().getAsDouble();
    }

    public static int min(int[] array) {

        return Arrays.stream(array).min().getAsInt();
    }

    public static int minIndex(int[] array) {

        return Arrays.stream(array).boxed().collect(Collectors.toList()).indexOf(min(array));
    }

    public static int filterZero(int[] array) {

        return (int) Arrays.stream(array).filter(arr -> arr == 0).count();
    }

    public static int filterMoreZero(int[] array) {

        return (int) Arrays.stream(array).filter(arr -> arr > 0).count();
    }

    public static double[] multiplication(int[] array, int numbe) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%.3f ", IntStream.of(array).mapToDouble(arr -> arr * numbe).toArray()[i]);

        }
        return Arrays.stream(array).mapToDouble(arr -> arr * numbe).toArray();
    }

    /**
     * IntStream
     */

    public static double averageIntSream(int[] array) {

        return IntStream.of(array).average().getAsDouble();
    }

    public static int minIntStream(int[] array) {

        return IntStream.of(array).min().getAsInt();
    }

    public static int minIndexIntSream(int[] array) {

        return IntStream.of(array).boxed().collect(Collectors.toList()).indexOf(minIntStream(array));
    }

    public static long filterZeroIntSream(int[] array) {

        return IntStream.of(array).filter(arr -> arr == 0).count();
    }

    public static long filterMoreZeroIntSream(int[] array) {

        return IntStream.of(array).filter(arr -> arr > 0).count();
    }

    public static double[] multiplicationIntSream(int[] array, double numbe) {

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%.3f ", IntStream.of(array).mapToDouble(arr -> arr * numbe).toArray()[i]);

        }
        return IntStream.of(array).mapToDouble(arr -> arr * numbe).toArray();
    }
}