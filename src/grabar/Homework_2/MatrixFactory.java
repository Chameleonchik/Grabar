package grabar.Homework_2;

public class MatrixFactory {
    public final static int MAX_VALUE_IN_MATRIX = 10;

    public static Matrix createMatrix(int row, int column) {
        Matrix matrix = new Matrix(row, column);

        for(int i = 0; i < row; ++i)
            for (int j = 0; j < column; ++j)
                matrix.setElement(i, j, (int)(Math.random() * MAX_VALUE_IN_MATRIX + 1));

        return matrix;
    }
}