package sortng;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
       int[] array = {6, 8, 9, 21, 1, 0};
       bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    static void bubbleSort(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
           int lastIndex = array.length - 1 - i;
           int startIndex = 0;
           boolean isSwapoccurred = false;

            for (int j = 1; j <= lastIndex ; j++) {
                int pointingElement = array[j];
                int prevElement = array[j - 1];

                if (prevElement > pointingElement){
                    int hold = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = hold;
                    isSwapoccurred = true;
                }
            }

            if (!isSwapoccurred){
                break;
            }
        }
    }
}
