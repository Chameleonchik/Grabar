package grabar.Test_Java;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test method!");
        //Logic.sum1(5, 7);
        System.out.println(Logic.sum1(9, 7));
        Logic logic = new Logic();
        //logic.sum2(0 , 87);
        //logic.HelloWorld();
        Logic.HelloWorld();
        double c = logic.sum2( 3 , 7);
        System.out.println(c);

        Logic.Letter();
    }
}
