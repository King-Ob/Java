package sort.stu;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Perform an out of place merge sort on a native array of integers.
 *
 * merge_sort (not in place):
 *     best=O(nlogn)
 *     worst=O(nlogn)
 *
 * @author RIT CS
 */
public class MergeSort {
    /**
     * Split the array on the left side.
     * @param data the full array of data
     * @return the left half side of the data
     */
    private static int[] splitLeft(int[] data) {
        // TODO
        return null;
    }

    /**
     * Split the array on the right side.
     * @param data the full array of data
     * @return the right half side of the data
     */
    private static int[] splitRight(int[] data) {
        // TODO
        return null;
    }

    /**
     * Merges two sorted arrays, left and right, into a combined sorted array.
     * @param left a sorted array
     * @param right a sorted array
     * @return one combined sorted array
     */
    private static int[] merge(int[] left, int[] right) {
        // TODO
        return null;
    }

    /**
     * Performs a merge sort and returns a newly sorted array
     * @param data the data to be sorted (a native array)
     * @return a sorted array
     */
    private static int[] mergeSort(int[] data) {
        // TODO
        return null;
    }

    /**
     * Test function for mergeSort.
     *
     * @param args command line arguments (unused)
     */
    public static void main(String[] args) {
        int[][] DATA = {
                {},
                {0},
                {0, 1},
                {1, 0},
                {0, 1, 2},
                {0, 2, 1},
                {1, 0, 2},
                {1, 2, 0},
                {2, 0, 1},
                {2, 1, 0},
                {9, 5, 2, 6, 3, 8, 1, 4, 0, 7}
        };

        for (int[] data : DATA) {
            // create two lists of the data
            int[] sortData = new int[data.length];
            System.arraycopy(data, 0, sortData, 0, data.length);
            int[] sorted = new int[data.length];
            System.arraycopy(data, 0, sorted, 0, data.length);

            // merge sort is not in place and returns a new sorted list
            sortData = mergeSort(sortData);

            // use built in sort to compare against
            Arrays.sort(sorted);

            // show the results of the comparison
            System.out.print("mergeSort: " + Arrays.stream(data).boxed().collect(Collectors.toList()) +
                    " result: " + Arrays.stream(sortData).boxed().collect(Collectors.toList()));
            System.out.println(Arrays.equals(sortData, sorted) ? " OK" : " FAIL");
        }
    }
}
