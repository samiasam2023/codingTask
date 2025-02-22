public class task9 {
    //Write a program to print out duplicate elements from an Array of Strings.

    /* method for verifying dupe elements in array.
    Chose method for efficiency and ability to use method in other test cases outside this program */
    public static void duplicateFinder(String[] array){
        boolean foundDuplicate = false;
        for(int i=0; i < array.length; i++){
            for(int j=i +1; j <array.length; j++){
                if (array[i].equalsIgnoreCase(array[j])){
                    System.out.println("Duplicate found in array! Duplicate is: " + array[i]);
                    foundDuplicate = true;
                }
            }
        }
        if (!foundDuplicate){
            System.out.println("No duplicates found in this array.");
        }
    }


    public static void main(String[] args) {
        // Test string
        String[] testString = {"Apples", "Bananas", "Oranges", "Lemons", "Lemons"};
        String[] testString2 = {"Bread", "Peanut Butter", "Jelly"};

        //find and print duplicate elements with the program
        duplicateFinder(testString);
        duplicateFinder(testString2);
    }
}