package Module6;

import java.util.Arrays;

public class SearchingExample {
    public static void main(String[] args) {
        int[] data = {67, 81, 23, 5, 78, 45, 61, 3, 98, 63};

        // Try binary search on unsorted data
        binarySearch(data, 23);

        // Sort the data
        Arrays.sort(data);

        // Try binary search on sorted data
        binarySearch(data, 23);
    }

    public static void binarySearch(int[] data, int target) {
        // Call recursive helper method on the bounds of the data array
        int index = binarySearchHelper(data, target, 0, data.length - 1);

        if (index == -1) {
            System.out.println("Element " + target + " not found");
        }
        else {
            System.out.println("Element " + target + " found at index " + index);
        }
    }

    private static int binarySearchHelper(int[] data, int target, int low, int high) {
        // Continue until target is found or array is exhausted
        if (high >= low) {
            int mid = (low + high) / 2;

            if (data[mid] == target) {
                // Return the index of the target
                return mid;
            }

            if (data[mid] > target) {
                // Recursively call on lower half of the array
                return binarySearchHelper(data, target, low, mid - 1);
            }

            // Recursively call on higher half of the array
            return binarySearchHelper(data, target, mid + 1, high);
        }

        // If target was not found, return -1
        return -1;
    }
}
