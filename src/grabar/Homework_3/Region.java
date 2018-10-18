package grabar.Homework_3;

public class Region  extends Ukraine {

    String center;
    double square;
    public static int counter = 1;

    public Region (String center, double square) {
        this.center = center;
        this.square = square;
        counter++;
    }
}
