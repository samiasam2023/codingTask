public class task8 {

    public static void main(String[] args) {

        //Write a Java program to find the second largest number in the array.
        //Write a Java program to find the second largest number in the array.
        int [] numbers={104,30,50,60,99,105,711,809,5,9,606};

        int largest=numbers[0];
        int secondLargest=numbers[1];

        for (int i = 1; i< numbers.length;i++){

            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            } else if (numbers[i]>secondLargest) {
                secondLargest=numbers[i];
            }

        }
        System.out.println(secondLargest);
    }
}
