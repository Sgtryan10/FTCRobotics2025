import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 3;
        int[] arr = {4, 3, 2, 8, 3};
        double[][] grid = { {4.0, 3.0, 2.0, 8.0, 3.0} , {4.0, 3.0, 2.0, 8.0, 3.0}};

        System.out.println("Test array: " + Arrays.toString(arr));
        System.out.println("Test 2D array: " + Arrays.deepToString(grid));

        System.out.println(n + " appears in array arr " + PracticeProblems.countOccurences(arr, n) + " times.");
        System.out.println("The test array reversed is: " + PracticeProblems.reverseArray(arr));
        System.out.println("The sum of the test 2D array is: " + PracticeProblems.sumGrid(grid));
        System.out.println("Fibonacci sequence number " + n + " is: " + PracticeProblems.fib(n));
    }
}
