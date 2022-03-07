package exampleArr;

import java.util.*;

// array là một tập hợp các phần tử có cùng kiểu dữ liệu
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
        // Array sắp xếp tất cả các phần tử của mảng
        Arrays.sort(array);
        printArray("Sorted array", array);

        // binarySearch() giúp tìm kiếm phần tử có giá trị xác định trong mảng đã sắp xếp
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

        // bubble sort (So sánh 2 phần tử cạnh nhau)

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
        String[] data = new String[5];
        System.out.println("Dimension 1: " + data.length);

        System.out.println("=====================Array output=========================");

        String[] greeting = new String[3];
        greeting[0] = "This is the greeting";
        greeting[1] = "for all the readers from";
        greeting[2] = "Java Source .";

        for (int i = 0; i < greeting.length; i++) {
            System.out.println(greeting[i]);
        }

        String[] arrStr = new String[] { "Tutorials", "Point", ".com" };

        //  toString() của mảng được sử dụng để hiển thị tất cả các phần tử của một mảng.
        System.out.println(Arrays.toString(arrStr));

        String[][] deepArr = new String[][] { { "Sai", "Gopal" }, { "Pallavi", "Priya" } };
        System.out.println(Arrays.toString(deepArr)); // no output

        //  Arrays.deepToString () được sử dụng để nhận được biểu diễn chuỗi của các mảng đa chiều.
        System.out.println(Arrays.deepToString(deepArr));

        System.out.println("=====================Search Max Min=========================");

        Integer[] numbers = { 8, 2, 7, 1, 4, 9, 5 };

        /*Collection có nhiều phương thức tĩnh (gọi mà không cần tạo ra đối tượng Collections) tiện dụng như:
        sort(Collection c) sắp xếp danh sách
        max(Collection c) lấy giá trị lớn nhất trong c
        reverse(List list) đảo ngược thứ tự
        shuffle(List list) sắp xếp danh sách ngẫu nhiên*/

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
        // hợp nhất 2 mảng
        // asList() được sử dụng để tạo một danh sách từ một mảng được chỉ định.
        String strA[] = { "A", "E", "I" };
        String strB[] = { "O", "U" };
        List list = new ArrayList(Arrays.asList(strA));

        // addAll() chèn tất cả các phần tử trong tập hợp đã chỉ định vào danh sách này, bắt đầu từ vị trí đã chỉ định.
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

        // arrays.fill hàm giúp thay đổi giá trị của tất cả các phần tử trong mảng thành một giá trị mới.
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
