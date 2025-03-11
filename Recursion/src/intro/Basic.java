package intro;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Basic {
    public static void main(String[] args) {
//        System.out.println("Hello I am Satya");
//        System.out.println(fibonacciNumber(5));
        int[] elements = {8,3,4,12,5, 6};
        System.out.println(Arrays.toString(mergeSort(elements)));
    }

    static int fibonacciNumber(int n){
        // Base condition --> f(0) =  0 & f(1) = 1
        if (n == 0){
            return  0;
        }

        if (n == 1){
            return 1;
        }

        return fibonacciNumber(n-1) + fibonacciNumber(n-2);
    }

    // merge Sort
    static int[] mergeSort(int[] numArray){
        //Base condition
        if (numArray.length == 1){
            return  numArray;
        }

        // more than one element so break again

        int mid = numArray.length/2;

        // Divide into two arrays
        int[] leftHalf = mergeSort(Arrays.copyOfRange(numArray, 0, mid));
        int[] rightHalf = mergeSort(Arrays.copyOfRange(numArray, mid, numArray.length));

        return mergeTwoSortedArray(leftHalf, rightHalf);
    }

    static int[] mergeTwoSortedArray(int[] leftSortedArray, int[] rightSortedArray){
        //  logic to put both sorted array into one sorted array
        int[] mergedArray = new int[leftSortedArray.length + rightSortedArray.length];

        int leftPointer = 0;
        int rightPointer = 0;
        int mergedArrayPointer = 0;
        // Up to similar length of elements
    while (leftPointer < leftSortedArray.length && rightPointer < rightSortedArray.length){
        if (leftSortedArray[leftPointer] < rightSortedArray[rightPointer]){
            mergedArray[mergedArrayPointer] = leftSortedArray[leftPointer];

            leftPointer++;
        }else{
            mergedArray[mergedArrayPointer] = rightSortedArray[rightPointer];
            rightPointer++;
        }

        mergedArrayPointer++;
    }

    // There may be a chance that no of elements in both the array could be different
        // Just add elements of remaining array int the merged array

        // First checking if left array has remaining elements
        while (leftPointer < leftSortedArray.length){
            mergedArray[mergedArrayPointer] = leftSortedArray[leftPointer];
            leftPointer++;
            mergedArrayPointer++;
        }

        // checking if right array has remaining elements
        while (rightPointer < rightSortedArray.length){
            mergedArray[mergedArrayPointer] = rightSortedArray[rightPointer];
            rightPointer++;
            mergedArrayPointer++;
        }



    return  mergedArray;
    }
}
