package collectionsJava;

import java.util.*;

public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        // them phan tu trong danh sach lien ket
        linkedList.add("hga");
        linkedList.add("tlq");
        linkedList.add("dnq");
        // Them phan tu vao dau danh sach lien ket
        linkedList.addFirst("vvh");
        Iterator<String> iterator1 = linkedList.iterator();
        System.out.println("Case 1");
        while(iterator1.hasNext()){
            System.out.print(iterator1.next()+ "  ");
        }
        System.out.println();
        linkedList.remove(1);
        Iterator<String> iterator2 =linkedList.iterator();
        System.out.println("Case 2");
        while(iterator2.hasNext()){
            System.out.print(iterator2.next() + " ");
        }
        System.out.println();
        // Them phan tu vao cuoi danh sach lien ket
        linkedList.addLast("kkg");
        // them phan tu tai vi tri index
        linkedList.add(2, "hgi");
        System.out.println("Case 3");
        Iterator<String> iterator3 = linkedList.iterator();
        while(iterator3.hasNext()){
            System.out.print(iterator3.next() + "  ");
        }

        /*
        1, boolean add(Object item): Thêm phần tử vào cuối LinkedList
        linkedList.add("hga");

        2, void add(int index, Object e): Thêm một phần tử tại vị trí index.
        linkedList.add(2, "hga");

        3, boolean addAll(Collection c): Thêm tất cả các phần tử trong Collection C vào LinkedList.
        linkedList.addAll(arrayList);

        4,  boolean addAll(int, index, Collection c): Thêm tất cả các phần tử trong Collection C vào vị trí index trong LinkedList
        linkedList.addAll(2, arrayList);

        5, void addFirst(Object e): Thêm phần tử vào đầu LinkedList.
        linkedList.addFirst("hga);

        6, void addLast(Object e): Thêm phần tử vào cuối LinkedList
        linkedList.addLast("hga);

        7, void clear(): Xóa tất cả các phần tử trong LinkedLí
        linkedList.clear("hga);

        8, Object clone(): Copy LinkedList
        linkedList.clone();

        9, boolean contains(Object o): Kiểm tra sự tồn tại của Object o trong LinkedList.
        boolean var = linkedList.contains("hga");

        10, Object get(int index): Lấy phần tử tại vị trí index trong LinkedList.
        Object o= linkedList.get(1);

        11, Object getFirst(): Lấy phần tử đầu tiên trong LinkedList(Head)
        Object o= linkedList.getFirst();

        12, Object getLast(): Lấy phần tử cuối cùng trong LinkedList(Head)
        Object o= linkedList.getLast();

        13, int indexOf(Object e):Trả về vị trí đầu tiên của object e
        int index = linkedList.indexOf("hga");

        14, int lastIndexOf(Object o): Trả về vị trí cuối cùng của Object o.
        int index = linkedList.lastIndexOf("hga");

        15, Object poll(): Trả về phần tử đầu tiên trong và xóa nó ra khỏi LinkedList.
        Object o= linkedList.poll();

        16, Object pollFirst(): Tương tự poll().
        Object o= linkedList.pollFirst();

        17, Object pollLast(): Trả về phần tử cuối cùng và xóa nó ra khởi LinkedList.
        Object o= linkedList.pollLast();

        18, Object remove(): Xóa phần tử đầu tiên của LinkedList.
        linkedList.remove();

        19, Object remove(int index): Xóa phần tử tại vị trí index.
        linkedList.remove(1);

        20, Object remove(Object o): Xóa Object o ra khởi LinkedList.
        linkedList.remove("hga");

        21, Object removeFirst(): Xóa phần tử đầu tiên.
        linkedList.removeFirst("hga");

        22, Object removeLast():Xóa phần tử cuối cùng.
        linkedList.removeLast("hga");

        23, Object set(int index, Object item): Cập nhật giá trị phần tử tại vị trí index bằng item.
        linkedList.set(1, "hga");

        24, int size(): Trả về số lượng phần tử.
        int size = linkedList.size();
        
        */
    }
}
