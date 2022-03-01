package exampleArr;

import java.util.*;

public class javaArrEx {

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        System.out.println("lenght: " + n);
        int temp = 0;
        int c = 0;
        int d = 0;
        for (int i = 0; i < n; i++) {
            c++;
            System.out.println("c: " + c);
            for (int j = 1; j < (n - i); j++) {
                d++;
                System.out.println("d: "+d);
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };

        // sắp xếp lại array
        Arrays.sort(array);
        printArray("Sorted array", array);
        int index = Arrays.binarySearch(array, 2);
        System.out.println("Found 2 @ " + index);

        int[] a = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
        int target = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                System.out.println("Element found at index " + i);
                break;
            }
        }

        // bubble sort

        int arr[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
        System.out.println("Array Before Bubble Sort");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        bubbleSort(arr);
        System.out.println("Array After Bubble Sort");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    // in ra array
    private static void printArray(String message, int array[]) {
        System.out.println(message + ": [length: " + array.length + "]");

        for (int i = 0; i < array.length; i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println();
    }
}
