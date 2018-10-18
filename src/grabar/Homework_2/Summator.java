package grabar.Homework_2;

public class Summator {

    public static Matrix sum(Matrix m1, Matrix m2){
        if ((m1.getHorizontalSize() != m2.getHorizontalSize()) || (m2.getVerticalSize() != m2.getVerticalSize()))
            throw new IllegalArgumentException("Not equal-sized matrices.");
        else {
            Matrix mRes = new Matrix(m1.getHorizontalSize(), m1.getVerticalSize());
            for (int i = 0; i < m1.getHorizontalSize(); ++i)
                for (int j = 0; j < m1.getVerticalSize(); ++j)
                    mRes.setElement(i, j, (m1.getElement(i, j) + m2.getElement(i, j)));
            return mRes;
        }
    }
}