package sortng;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {8,3,4,12,5,6};
        System.out.println(Arrays.toString(nums));
        nums = mergeSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static int[] mergeSort(int[] arr){
        if (arr.length == 1){
            return  arr;
        }

        int mid = arr.length/2;
        int [] leftHalf = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int [] rightHalf = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return mergeTwoSortedArray(leftHalf, rightHalf);
    }

    private static int[] mergeTwoSortedArray(int[] leftHalf, int[] rightHalf) {
        int l = 0; // indicating left index
        int r = 0; // indication right index
        int m = 0; // indicating mix
        int[] mix = new int[leftHalf.length + rightHalf.length];

        while (l < leftHalf.length && r < rightHalf.length){
            if (leftHalf[l] < rightHalf[r]){
                mix[m] = leftHalf[l];
                l++;
            }else{
                mix[m] = rightHalf[r];
                r++;
            }
            m++;
        }

        // loop completed but still there are remaining elements in either left array or right array
        // some elements left in left half so replace all of them
        while (l < leftHalf.length){
            mix[m] = leftHalf[l];
            m++;
            l++;
        }

        // some elements left in right half so replace all of them
        while (r < rightHalf.length){
            mix[m] = rightHalf[r];
            m++;
            r++;
        }

        return  mix;
    }
}
