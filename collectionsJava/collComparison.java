package collectionsJava;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

// How to compare elements in a collection? (So sánh các phần tử)

public class collComparison {
    public static void main(String[] args) {
        int[] coins = { 9, 3, 2, 1, 8, 6, 4 };

        /*
         * Set là một interface kế thừa Collection interface trong java.
         * Set trong java là một Collection không thể chứa các phần tử trùng lặp.
         */

        /*
         * Vì Set là một (giao diện) interface, bạn cần khởi tạo một triển khai cụ thể
         * của giao diện để sử dụng nó. Về cơ bản bạn có thể chọn các collection sau:
         * 
         * HashSet
         * LinkedHashSet
         * TreeSet
         * 
         * Set setB = new HashSet();
         * Set setC = new LinkedHashSet();
         * Set setD = new TreeSet();
         */
        Set set = new TreeSet();

        for (int i = 0; i < coins.length; i++) {
            // Để thêm các phần tử cho một Set bạn gọi phương thức add().
            set.add(coins[i]);
        }

        // Collections.min() được sử dụng để trả lại phần tử min của bộ sưu tập đã cho
        System.out.println(Collections.min(set));

        // Collections.max() được sử dụng để trả về phần tử max của bộ sưu tập đã cho
        System.out.println(Collections.max(set));
    }
}
