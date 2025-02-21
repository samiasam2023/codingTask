public class task2 {

    public static void main(String[] args) {

        //Create an array of integer values. After the array is created, calculate the sum of all stored elements
        //in that array
        int [] values={100, 56, 85, 45, 200};
        int sum=0;
        for (int add: values) {
            sum += add;
        }
        System.out.println(sum);
    }
}
