package exampleArr;

import java.util.*;

public class reverseArr {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        System.out.println("Before Reverse Order: " + arrayList);

      //   Collections.reverse được sử dụng để đảo ngược thứ tự của các phần tử trong danh sách được chỉ định..
        Collections.reverse(arrayList);
        System.out.println("After Reverse Order: " + arrayList);


        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
      System.out.println("Array before reverse:");
      System.out.println(numbers.length);
      for (int i = 0; i < numbers.length; i++) {
         System.out.print(numbers[i] + " ");
      } 
      for (int i = 0; i < numbers.length / 2; i++) {
         int temp = numbers[i];//=1
         //System.out.println(temp + " ");
         numbers[i] = numbers[numbers.length - 1 - i]; // number[0] = number[9] = 10
         numbers[numbers.length - 1 - i] = temp; // number[9] = 1
      } 
      System.out.println("\nArray after reverse:");
      for (int i = 0; i < numbers.length; i++) {
         System.out.print(numbers[i] + " ");
      } 
     }
}
