package grabar.Stream_task;

public class Report {
    public static void reportForUser() {

        int[] array = ArrayFactory.createintArray();
        System.out.printf(View.INPUT_ARRAY_LENGTH, array.length);
        System.out.printf(View.AVERAGE_ARRAY_VALUE, ArrayOptions.averageIntSream(array));
        System.out.println(View.MIN_INT_VALUE + ArrayOptions.minIntStream(array));
        System.out.println(View.MIN_INT_INDEX + ArrayOptions.minIndexIntSream(array));
        System.out.println(View.ZERO_ELEMENTS + ArrayOptions.filterZeroIntSream(array));
        System.out.println(View.ABOVE_ZERO_ELEMENTS + ArrayOptions.filterMoreZeroIntSream(array));
        System.out.print(View.MULTIPLIED_ARRAY);
        System.out.println(View.INDEX_OF_MULTIPLYING);
        double numbe = ArrayFactory.inputDoubleValue();
        ArrayOptions.multiplicationIntSream(array, numbe);

    }
}
