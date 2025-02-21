public class task3 {

    public static void main(String[] args) {

        //Create a 2D array or integer type where you will store odd and even numbers. Develop a program
        //that will identify/print the even numbers only.
        int[][] numbers = {{3, 8, 11, 55,},
                {22, 41, 26, 35},
                {71, 53, 66, 49},
                {43, 24, 31, 28}
        };
        System.out.println("Odd Numbers");
        for (int[] num : numbers) {
            for (int numc : num) {
                if (numc % 2 != 0) {
                    System.out.print(numc + " ");
                }
            }
            System.out.println();
        }
        System.out.println("Even Numbers");

        for (int[] num : numbers) {
            for (int numc : num) {
                if (numc % 2 == 0) {
                    System.out.print(numc + " ");
                }
            }
            System.out.println();
        }
    }
}
