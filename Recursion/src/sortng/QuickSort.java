package sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {6, 8, 9, 21, 1, 0};
        quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    static void quickSort(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }

        int low = start;
        int high = end;

        // Find Pivot
        int mid = (low + high) / 2;
        int pivotValue = nums[mid];

        System.out.println("Start: " + start + " End: " + end);
        System.out.println("Pivot: " + pivotValue + " at Index: " + mid);

        while (low <= high) {
            while (nums[low] < pivotValue) {
                low++;
            }

            while (nums[high] > pivotValue) {
                high--;
            }

            // Swap elements to correct partition
            if (low <= high) {
                int temp = nums[low];
                nums[low] = nums[high];
                nums[high] = temp;

                low++;
                high--;
            }
        }

        // Recursively sort left and right subarrays
        quickSort(nums, start, high);
        quickSort(nums, low, end);
    }
}