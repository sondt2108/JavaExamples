package collectionsJava;

import java.util.TreeMap;

public class printColl {
    public static void main(String[] args) {
        System.out.println("Tree Map Example!\n");
        /*
         * TreeMap lưu trữ dữ liệu dưới dạng cặp key và value.
         * Nó chứa các key duy nhất.
         * Nó KHÔNG cho phép bất kỳ key nào là null và nhưng có thể có nhiều giá trị null.
         * Nó duy trì các phần tử được thêm vào theo thứ tự key tăng dần.
         */
        TreeMap<Integer, String> tMap = new TreeMap<Integer, String>();
        // thêm các phần tử
        tMap.put(1, "Sunday");
        tMap.put(2, "Monday");
        tMap.put(3, "Tuesday");
        tMap.put(4, "Wednesday");
        tMap.put(5, "Thursday");
        tMap.put(6, "Friday");
        tMap.put(7, "Saturday");
        // keySet() lấy ra một đối tượng chứa các key của TreeMap
        System.out.println("Keys of tree map: " + tMap.keySet());
        // keyValues() lấy ra một đối tượng chứa các phần tử của TreeMap
        System.out.println("Values of tree map: " + tMap.values());
        // get(key) trả về giá trị của phần tử có key đã chỉ định
        System.out.println("Key: 5 value: " + tMap.get(5) + "\n");
        // Trả về key đầu tiên của map đã được sắp xếp. 
        System.out.println(
                "First key: " + tMap.firstKey() + " Value: " + tMap.get(tMap.firstKey()) + "\n");
        // Trả về key cuối cùng của map đã được sắp xếp.
        System.out.println(
                "Last key: " + tMap.lastKey() + " Value: " + tMap.get(tMap.lastKey()) + "\n");
        // Xóa một phần tử có key được chỉ định ra khởi TreeMap.
        System.out.println("Removing first data: " + tMap.remove(tMap.firstKey()));
        System.out.println("Now the tree map Keys: " + tMap.keySet());
        System.out.println("Now the tree map contain: " + tMap.values() + "\n");
        System.out.println("Removing last data: " + tMap.remove(tMap.lastKey()));
        System.out.println("Now the tree map Keys: " + tMap.keySet());
        System.out.println("Now the tree map contain: " + tMap.values());
    }
}
