package grabar.Homework_2;

public class Matrix {

    private int arr[][];

    public Matrix(int row, int column) {
        arr = new int[row][column];
    }

    public int getElement(int row, int column) {
        return arr[row][column];
    }

    public void setElement(int row, int column, int elem) {
        arr[row][column] = elem;
    }

    public int getHorizontalSize() {
        return arr[0].length;
    }

    public int getVerticalSize() {
        return arr.length;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();

        for (int[] anArr : arr) {
            for (int elem : anArr) {
                str.append(elem).append(' ');
            }
            str.append('\n');
        }
        return str.toString();
    }
}