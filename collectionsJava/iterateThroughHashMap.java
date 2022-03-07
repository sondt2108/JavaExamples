package collectionsJava;

import java.util.*;

public class iterateThroughHashMap {
    public static void main(String[] args) {
        /*
         * HashMap lưu trữ dữ liệu dưới dạng cặp key và value.
         * Nó chứa các key duy nhất.
         * Nó có thể có 1 key là null và nhiều giá trị null.
         * Nó duy trì các phần tử KHÔNG theo thứ tự.
         */
        HashMap<String, String> hMap = new HashMap<String, String>();
        
        hMap.put("1", "1st");
        hMap.put("2", "2nd");
        hMap.put("3", "3rd");
        
        Iterator itr = hMap.values().iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
