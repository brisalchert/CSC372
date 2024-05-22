package Module6;

public class TimeComplexityExample {
    public static void main(String[] args) {
        int[] bigArray = new int[10000];
        int target;
        long startTime;
        long endTime;
        long runtime;

        // Fill the array with numbers 1 - 10000
        for (int i = 0; i < bigArray.length; i++) {
            bigArray[i] = i + 1;
        }

        // Search the array for the value 7689 with a linear search
        target = 7689;

        startTime = System.nanoTime();

        System.out.println("Target " + target + " found at index " + linearSearch(bigArray, target));

        endTime = System.nanoTime();

        runtime = endTime - startTime;

        System.out.println("Runtime: " + runtime / 1000000.0 + " ms");

        // Search the array for the value 7689 with a binary search
        startTime = System.nanoTime();

        SearchingExample.binarySearch(bigArray, target);

        endTime = System.nanoTime();

        runtime = endTime - startTime;

        System.out.println("Runtime: " + runtime / 1000000.0 + " ms");
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
