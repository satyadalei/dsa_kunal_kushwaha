import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        printNUmberRecursively(5);
//        printNumberFromOne(6);
//        printPattern(4);
//        printPattern2(4);
//        printPatterUsingRecursion(1,4, 1,4);
//        printPatterUsingRecursion2(4,0);
//        printPatterUsingRecursion3(4,0);
          int[] nums = {4,3,2,1};
//        bubleSortUsingRecursion(0, nums.length-1,nums);
        selectionSortUsingRecursion(0,nums.length-1, 0,  nums);
        System.out.println(Arrays.toString(nums));

    }




    static void printNUmberRecursively(int number){
        if (number > 0){
            System.out.println(number);
            printNUmberRecursively(number - 1);
        }
    }

    static void printNumberFromOne(int number){
        if (number > 0){
            printNumberFromOne(number - 1);
            System.out.println(number);
        }
    }

    static void printPattern(int row, int col){
        // prints triangle
        if (row > 0){
            System.out.println("*");
        }
    }

    static void printPattern(int n){
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }

    static void printPattern2(int num){
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static void printPatterUsingRecursion(int currentRowValue, int maxRowValue, int currentColValue, int maxColValue){
        if (currentRowValue <= maxRowValue){
            if (currentColValue < maxColValue){
                System.out.println("*");
                printPatterUsingRecursion(currentRowValue, maxRowValue, currentColValue++, maxColValue);
            }
            if (currentColValue == maxColValue){
                printPatterUsingRecursion(currentRowValue++, maxRowValue, 1, (maxRowValue - currentRowValue) + 1);
            }
        }
    }

    static void printPatterUsingRecursion2(int row, int col){
//        if (row <= 0){
//            return;
//        }
        if (col < row){
            System.out.print("*");
            printPatterUsingRecursion2(row, col+1);
        }

        if (col == row){
            System.out.print("\n");
            printPatterUsingRecursion2(row-1, col = 0);
        }
    }

    static void printPatterUsingRecursion3(int row, int col){
        if (row <= 0){
            return;
        }
        if (col < row){
            printPatterUsingRecursion2(row, col+1);
            System.out.print("*");
        }

        if (col == row){
            printPatterUsingRecursion2(row-1, col = 0);
            System.out.println();
        }
    }

    static void bubleSortUsingRecursion(int currentCheckingPoint, int uptoCheckingPoint, int[] nums){
        if (uptoCheckingPoint == 0){
            return;
        }

        if (currentCheckingPoint < uptoCheckingPoint){
            // check if larger, if yes then swap & then call nextFunc with incrementing currentChecking point
            if (nums[currentCheckingPoint] > nums[currentCheckingPoint + 1]){
                int hold = nums[currentCheckingPoint] ;
                nums[currentCheckingPoint] = nums[currentCheckingPoint + 1];
                nums[currentCheckingPoint + 1] = hold;
                // swap done
            }
            bubleSortUsingRecursion(currentCheckingPoint + 1, uptoCheckingPoint, nums);
        }else{
            // reset current checking to starting to 0 & decrease uptoCheckingPoint by one
            bubleSortUsingRecursion(0, uptoCheckingPoint-1, nums);
        }
    }

    static  void selectionSortUsingRecursion(int currentCheckingIndex,int uptoCheckingIndex,int largestNumAtIndex,int[] nums){
        if (uptoCheckingIndex <= 0){
            // reached at last
            return;
        }
        if (currentCheckingIndex == uptoCheckingIndex){
          // Means last swap the largest with last one

          // before swapping the last element also check that if the last checking element is not greater than the current last element??
          if (nums[uptoCheckingIndex] > nums[largestNumAtIndex]) {
              largestNumAtIndex = uptoCheckingIndex;
          }
          int hold = nums[uptoCheckingIndex];
          nums[uptoCheckingIndex] = nums[largestNumAtIndex];
          nums[largestNumAtIndex] = hold;

          // reset checking with currentCheckingIndex to 0 & uptoCheckingIndex - 1
          selectionSortUsingRecursion(0,uptoCheckingIndex-1,0,nums);
      }else{
            if (nums[currentCheckingIndex] > nums[largestNumAtIndex]){
                selectionSortUsingRecursion(currentCheckingIndex+1,uptoCheckingIndex, currentCheckingIndex, nums);
            }else {
                selectionSortUsingRecursion(currentCheckingIndex+1,uptoCheckingIndex, largestNumAtIndex, nums);
            }
        }
    }

}