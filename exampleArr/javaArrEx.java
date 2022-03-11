package exampleArr;

import java.util.*;

// array là một tập hợp các phần tử có cùng kiểu dữ liệu
public class javaArrEx {



    public static void main(String[] args) throws Exception {
        int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };

        // sắp xếp lại array
        // Array sắp xếp tất cả các phần tử của mảng
        Arrays.sort(array);
        printArray("Sorted array", array);

        // binarySearch() giúp tìm kiếm phần tử có giá trị xác định trong mảng đã sắp xếp
        int index = Arrays.binarySearch(array, 2);
        System.out.println("Found 2 @ " + index);





        System.out.println("=====================Dimension of Array(Kích thước của mảng)=========================");
        String[] data = new String[5];
        System.out.println("Dimension 1: " + data.length);


        System.out.println("=====================Extending an Array=========================");

        String[] names = new String[] { "A", "B", "C" };
        String[] extended = new String[5];
        extended[3] = "D";
        extended[4] = "E";

        /*System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length);

        Trong đó:

        scr là mảng nguồn cần sao chép
        srcPos là vị trí bắt đầu sao chép trong mảng nguồn
        dest là mảng đích chứa kết quả sao chép
        destPos là vị trí bắt đầu dán kết quả vào mảng đích
        length là số phần tử được copy từ mảng nguồn*/

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

        //arrays.equals() được sử dụng để so sánh hai mảng có bằng nhau hay không.
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

        // .remove xóa phần tử có chỉ số index. nếu index > size() hoặc index < 0 thì ném ra ngoại lệ IndexOutOfBoundsException
        arrRemove.remove(2);
        System.out.println("Now, Size of list: " + arrRemove.size());

        for (Integer number : arrRemove) {
            System.out.println("Number = " + number);
        }

        System.out.println("=====================Remove an array from another array=========================");
        // xóa 1 mảng khỏi một mảng khác
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
        
        // .removeAll  sử dụng để xóa tất cả các phần tử của một tập trong mảng arraylist.
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
