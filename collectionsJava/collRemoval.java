package collectionsJava;

import java.util.*;

public class collRemoval {
    public static void main(String[] args) {
        System.out.println("Collection Example!\n");
        int size;

        /*
         * HashSet chỉ chứa các phần tử duy nhất.
         * HashSet lưu trữ các phần tử bằng cách sử dụng một cơ chế được gọi là băm
         * (hash table).
         */

        /*
         * Băm là một kỹ thuật được sử dụng để định danh một đối tượng cụ thể trong một
         * nhóm các đối tượng tương tự. Một số ví dụ về việc sử dụng bảng băm trên thực
         * tế:
         * 
         * Trong trường đại học, mỗi sinh viên được chỉ định một mã sinh viên không
         * giống nhau và qua mã sinh viên đó có thể truy xuất các thông tin của sinh
         * viên đó.
         */
        HashSet<String> collection = new HashSet<String>();
        String str1 = "Yellow", str2 = "White", str3 = "Green", str4 = "Blue";

        /*
         * Duyệt các phần tử từ đầu đến cuối của một collection.
         * Iterator cho phép xóa phần tử khi lặp một collection.
         */
        Iterator iterator;
        collection.add(str1);
        collection.add(str2);
        collection.add(str3);
        collection.add(str4);
        System.out.print("Collection data: ");
        iterator = collection.iterator();

        // boolean hasNext() Nó trả về true nếu iterator còn phần tử kế tiếp phần tử
        // đang duyệt.
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        // remove() Loại bỏ phần tử hiện tại khỏi danh sách
        collection.remove(str2);
        System.out.println("After removing [" + str2 + "]\n");
        System.out.print("Now collection data: ");
        iterator = collection.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        size = collection.size();
        System.out.println("Collection size: " + size + "\n");

        if (collection.isEmpty()){
            System.out.println("Collection is empty");
         } else {
            System.out.println( "Collection size: " + size);
         }
    }
}
