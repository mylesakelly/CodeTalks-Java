import java.util.Arrays;
// This code sorts an array of integers in ascending order
// using the Arrays.sort() method from the java.util package.

public class ArraySorting {
    public static void main(String[] args) {

        int[] numbers = {5, 2, 8, 1, 9};
//        this method will sort all the numbers and put them in ascending order
        Arrays.sort(numbers);
//        sorted numbers are printed to the terminal
        System.out.print("Sorted Array: ");
//        the for loop will loop through the array of numbers and print each number with a space following it
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}

