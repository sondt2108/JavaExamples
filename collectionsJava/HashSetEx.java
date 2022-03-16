package collectionsJava;

import java.util.*;

public class HashSetEx {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<String>();
        // Adding elements into HashSet usind add()
        h.add("HGA");
        h.add("SHI");
        h.add("LFD");
        // Displaying the HashSet
        System.out.println(h);
        System.out.println("List contains HGA or not:" +
                h.contains("HGA"));
        // Removing items from HashSet using remove()
        h.remove("HGA");
        System.out.println("List after removing HGA:" + h);
        // Iterating over hash set items
        System.out.println("Iterating over list:");
        Iterator<String> i = h.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }
}

/*
boolean add(E e): Thêm phần tử vào HashSet. Nếu phần tử đã tồn tại trả về false.
void clear(): Xóa tất cả các phần tử trong HashSet.
boolean contains(Object o): Kiểm tra sự tồn tại của phần tử trong HashSet.
boolean remove(Object o): Xóa phần tử khỏi HashSet, trả về false nếu phần tử không tồn tại trong HashSet
boolean isEmpty(): Trả về true nếu HashSet không chứa bất kỳ phần tử nào.
int size(): Trả về số lượng phần tử trong HashSet.
Object clone(): Copy HashSet mới từ một HashSet cho trước.

*/