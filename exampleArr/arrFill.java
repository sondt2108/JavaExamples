package exampleArr;

import java.util.Arrays;

public class arrFill {
    public static void main(String[] args) {
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
    }
}
