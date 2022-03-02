package exampleArr;

import java.util.*;

public class javaArrEx {

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        System.out.println("lenght: " + n);
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
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

        System.out.println("=====================Linear Search(tìm kiếm tuyến tính)=========================");

        int[] a = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
        int target = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                System.out.println("Element found at index " + i);
                break;
            }
        }

        System.out.println("=====================Bubble sort=========================");

        // bubble sort

        int arr[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
        System.out.println("Array Before Bubble Sort");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        bubbleSort(arr); // gọi hàm bubble
        System.out.println("Array After Bubble Sort");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("=====================Dimension of Array(Kích thước của mảng)=========================");
        String[][] data = new String[2][5];
        System.out.println("Dimension 1: " + data.length);
        System.out.println("Dimension 2: " + data[0].length);

        System.out.println("=====================Array output=========================");

        String[] greeting = new String[3];
        greeting[0] = "This is the greeting";
        greeting[1] = "for all the readers from";
        greeting[2] = "Java Source .";

        for (int i = 0; i < greeting.length; i++) {
            System.out.println(greeting[i]);
        }

        String[] arrStr = new String[] { "Tutorials", "Point", ".com" };
        System.out.println(Arrays.toString(arrStr));

        String[][] deepArr = new String[][] { { "Sai", "Gopal" }, { "Pallavi", "Priya" } };
        System.out.println(Arrays.toString(deepArr)); // no output
        System.out.println(Arrays.deepToString(deepArr));

        System.out.println("=====================Search Max Min=========================");

        Integer[] numbers = { 8, 2, 7, 1, 4, 9, 5 };
        int min = (int) Collections.min(Arrays.asList(numbers));
        int max = (int) Collections.max(Arrays.asList(numbers));

        System.out.println("Min number: " + min);
        System.out.println("Max number: " + max);

        //

        int numbersArr[] = new int[] { 8, 2, 7, 1, 4, 9, 5 };
        int s = numbersArr[0];
        int l = numbersArr[0];

        for (int i = 1; i < numbersArr.length; i++) {
            if (numbersArr[i] > l) {
                l = numbersArr[i];
            } else if (numbersArr[i] < s) {
                s = numbersArr[i];
            }
        }
        System.out.println("Largest Number is : " + l);
        System.out.println("Smallest Number is : " + s);

        System.out.println("=====================Merge two arrays=========================");

        String strA[] = { "A", "E", "I" };
        String strB[] = { "O", "U" };
        List list = new ArrayList(Arrays.asList(strA));
        list.addAll(Arrays.asList(strB));
        Object[] c = list.toArray();
        System.out.println(Arrays.toString(c));

        //

        int[] arrNumberA = { 1, 2, 3, 4 };
        int[] arrNumberB = { 4, 16, 1, 2, 3, 22 };
        int[] arrNumberC = new int[arrNumberA.length + arrNumberB.length];
        int count = 0;

        for (int i = 0; i < arrNumberA.length; i++) {
            arrNumberC[i] = arrNumberA[i];
            count++;
        }
        for (int j = 0; j < arrNumberB.length; j++) {
            arrNumberC[count++] = arrNumberB[j];
        }
        for (int i = 0; i < arrNumberC.length; i++)
            System.out.print(arrNumberC[i] + " ");
        System.out.println();
        System.out.println("=====================Arrays.fill=========================");
        int arrFill[] = new int[6];
        Arrays.fill(arrFill, 100);

        for (int i = 0, n = arrFill.length; i < n; i++) {
            System.out.println(arrFill[i]);
        }
        System.out.println();
        Arrays.fill(arrFill, 3, 6, 50); // (int[] a, int from_Index, int to_Index, int val)

        for (int i = 0, n = arrFill.length; i < n; i++) {
            System.out.println(arrFill[i]);
        }

        System.out.println("=====================Extending an Array=========================");

        String[] names = new String[] { "A", "B", "C" };
        String[] extended = new String[5];
        extended[3] = "D";
        extended[4] = "E";
        System.arraycopy(names, 0, extended, 0, names.length);

        for (String str : extended) {
            System.out.println(str);
        }

        System.out.println("=====================Check equality of two arrays=========================");

        int[] ary = { 1, 2, 3, 4, 5, 6 };
        int[] ary1 = { 1, 2, 3, 4, 5, 6 };
        int[] ary2 = { 1, 2, 3, 4 };
        System.out.println("Is array 1 equal to array 2?? " + Arrays.equals(ary, ary1));
        System.out.println("Is array 1 equal to array 3?? " + Arrays.equals(ary, ary2));

        //
        int arr1[] = { 1, 2, 3 };
        int arr2[] = { 1, 2, 3 };

        if (arr1 == arr2) {
            System.out.println("Same");
        } else {
            System.out.println("Not same");
        }

        //
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Same");
        } else {
            System.out.println("Not same");
        }

        System.out.println("=====================Remove an element=========================");

        ArrayList<Integer> arrRemove = new ArrayList<Integer>(5);
        arrRemove.add(20);
        arrRemove.add(15);
        arrRemove.add(30);
        arrRemove.add(45);

        System.out.println("Size of list: " + arrRemove.size());
        for (Integer number : arrRemove) {
            System.out.println("Number = " + number);
        }
        arrRemove.remove(2);
        System.out.println("Now, Size of list: " + arrRemove.size());

        for (Integer number : arrRemove) {
            System.out.println("Number = " + number);
        }

        System.out.println("=====================Remove an array from another array=========================");

        ArrayList objArray = new ArrayList();
        ArrayList objArray2 = new ArrayList();
        objArray2.add(0, "common1");
        objArray2.add(1, "common2");
        objArray2.add(2, "notcommon");
        objArray2.add(3, "notcommon1");
        objArray.add(0, "common1");
        objArray.add(1, "common2");
        objArray.add(2, "notcommon2");
        System.out.println("Array elements of array1" + objArray);
        System.out.println("Array elements of array2" + objArray2);
        // objArray.retainAll(objArray2);
        // System.out.println("Array1 after retaining common elements of array2 &
        // array1" + objArray);
        objArray.removeAll(objArray2);
        System.out.println("Array1 after removing array2 from array1" + objArray);

        System.out.println("=====================Find common elements from arrays=========================");

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
