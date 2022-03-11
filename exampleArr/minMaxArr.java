package exampleArr;

import java.util.Arrays;
import java.util.Collections;

public class minMaxArr {
    public static void main(String[] args) {
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

    }
}
