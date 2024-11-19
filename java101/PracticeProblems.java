public class PracticeProblems {
    public static int countOccurences(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                count++;
            }
        }
        return count;
    }

    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - i - 1];
        }

        return reversed;
    }

    public static double sumGrid(double[][] grid) {
        double sum = 0;

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                sum += grid[i][j];
            }
        }

        return sum;
    }

    public static double fib(int n) {
        // Binet's Formula
        return (Math.pow((1 + Math.sqrt(5)) / 2, n) - (Math.pow((1 - Math.sqrt(5)) / 2, n))) / Math.sqrt(5.0);
    }
}
