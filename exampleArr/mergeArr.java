package exampleArr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergeArr {
    public static void main(String[] args) {
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


    }
}
