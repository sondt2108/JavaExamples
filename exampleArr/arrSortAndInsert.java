package exampleArr;

import java.util.Arrays;

public class arrSortAndInsert {
    public static void main(String args[]) {
        int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
        Arrays.sort(array);
        printArray("Sorted array", array);
        
        int index = Arrays.binarySearch(array, 1);
        // return index of the search key, if it is contained in the array; otherwise, (-(insertion point) - 1).
        System.out.println("Didn't find 1 @ " + index);
        
        int newIndex = -index - 1;
        array = insertElement(array, 1, newIndex);
        printArray("With 1 added", array);
     }
     private static void printArray(String message, int array[]) {
        System.out.println(message + ": [length: " + array.length + "]");
        for (int i = 0; i < array.length; i++) {
           if (i != 0){
              System.out.print(", ");
           }
           System.out.print(array[i]);         
        }
        System.out.println();
     }
     private static int[] insertElement(int original[], int element, int index) {
        int length = original.length;
        int destination[] = new int[length + 1];
        System.arraycopy(original, 0, destination, 0, index);
        // destination : -9, -7, -3, -2, 0, 0, 0, 0, 0, 0, 0
        destination[index] = element;
        System.arraycopy(original, index, destination, index + 1, length - index); // copy 6-
        // destination : -9, -7, -3, -2, 0, 1, 2, 4, 5, 6, 8
        return destination;
     }
}
