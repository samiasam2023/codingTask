import java.util.Scanner;

public class task6 {

    public static void main(String[] args) {

        //Write a Java program to check whether a given number is prime or not.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();

        if (num1 <= 1) {
            System.out.println("The number is a prime number.");
        } else {
            boolean prime = true;

            for (int i = 2; i * i <= num1; i++) {
                if (num1 % 1 == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.println("The number is a prime number.");
            } else {
                System.out.println("The number is not a prime number.");
            }
        }
        sc.close();
    }
}
