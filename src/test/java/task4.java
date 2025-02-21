public class task4 {

    public static void main(String[] args) {

        //Create a 2D array of integers. Develop a program that will calculate the sum of even and odd
        //numbers separately for that array.


        int[][] tNum = {
                {2, 5, 3, 4, 8},
                {13, 16, 15, 1, 41},
                {14, 33, 11, 22, 31}
        };

        int evenS = 0;
        int oddS = 0;
        for (int[] r : tNum) {
            for (int c : r) {
                if (c % 2 == 0) {
                    evenS += c;
                } else {
                    oddS += c;
                }
            }
        }

        System.out.println("evenSum " + evenS);
        System.out.println("OddSum " + oddS);


    }
}


