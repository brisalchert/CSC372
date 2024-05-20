package Module6;

import java.util.ArrayList;
import java.util.Comparator;

public class MergeSort {
    public <T> void mergeSort(ArrayList<T> data, Comparator<T> comparator) {
        // Sort the whole collection
        sort(data, comparator, 0, data.size() - 1);
    }

    private <T> void merge(ArrayList<T> data, Comparator<T> comparator, int left, int mid, int right) {
        
    }

    private <T> void sort(ArrayList<T> data, Comparator<T> comparator, int left, int right) {
        // Check that there is more than one element to sort
        if (left < right) {
            int mid = (left + right) / 2;

            // Split the array and sort both halves
            sort(data, comparator, left, mid);
            sort(data, comparator, mid + 1, right);

            // Merge the sorted halves
            merge(data, comparator, left, mid, right);
        }
    }
}
