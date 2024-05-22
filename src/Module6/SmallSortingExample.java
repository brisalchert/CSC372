package Module6;

import java.util.Arrays;

public class SmallSortingExample {
    public static void main(String[] args) {
        int[] data = {23, 45, 1, 29, 3, 62};
        long startTime;
        long endTime;
        long runtime;

        // Sort the data set using selection sort
        int[] dataCopy = Arrays.copyOf(data, data.length);

        startTime = System.nanoTime();

        selectionSort(dataCopy);

        endTime = System.nanoTime();

        System.out.println(Arrays.toString(dataCopy));

        runtime = endTime - startTime;
        System.out.println("Runtime with selection sort: " + runtime / 1000000.0 + " ms");

        // Sort the data set using merge sort (Arrays.sort)
        startTime = System.nanoTime();

        Arrays.sort(data);

        endTime = System.nanoTime();

        System.out.println(Arrays.toString(data));

        runtime = endTime - startTime;
        System.out.println("Runtime with merge sort: " + runtime / 1000000.0 + " ms");
    }

    public static void selectionSort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int minIndex = i;

            // Find the minimum element in the remaining unsorted elements
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[minIndex]) {
                    minIndex = j;
                }
            }

            // Sort the minimum element
            int temp = data[minIndex];
            data[minIndex] = data[i];
            data[i] = temp;
        }
    }
}
