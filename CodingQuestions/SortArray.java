//Sorting first half of array in acending order and second half of array in decending order

import java.util.*;

class SortArray {
    static void printOrder(int[] arr, int n) {
        Arrays.sort(arr);

        // printing second half in acending
        // order
        for (int i = 0; i < n / 2; i++)
            System.out.print(arr[i] + " ");

        // printing second half in descending
        // order
        for (int j = n - 1; j >= n / 2; j--)
            System.out.print(arr[j] + " ");

    }

    // Driver code
    public static void main(String[] args) {
        int[] arr = { 5, 4, 6, 2, 1, 3, 8, 9, 7 };
        int n = arr.length;
        printOrder(arr, n);

    }
}
/* This code is contributed by Mr. Somesh Awasthi */
