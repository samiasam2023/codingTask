public class task7 {

    public static void main(String[] args) {

        //Write a Java Program to print the first 10 numbers of the Fibonacci series.
        int n = 10, firstNum = 0, secondNum = 1;


        for (int i = 1; i <= n; i++) {
            System.out.print(firstNum + " ");
            int nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }

    }
}
