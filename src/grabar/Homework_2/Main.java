package grabar.Homework_2;


public class Main {
    public static void main(String[] args) {
        Matrix m1 = MatrixFactory.createMatrix(4,4);
        Matrix m2 = MatrixFactory.createMatrix(4,4);

        System.out.println(m1);
        System.out.println();
        System.out.println(m2);

        Matrix sumOfm1m2 = Summator.sum(m1, m2);
        System.out.println(sumOfm1m2);
    }
}