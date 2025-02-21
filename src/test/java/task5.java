public class task5 {

    public static void main(String[] args) {

        //Write a program to swap 2 numbers without a temporary variable
        int x = 2;
        int y = 4;
        System.out.println("x= " + x + " y = " + y);

        x = x + y;
        y = x - y;
        x = x - y;
        y = x - y;

        System.out.println("x= " + x + " y = " + y);
    }
}
