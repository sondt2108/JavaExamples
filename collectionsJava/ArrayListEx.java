package collectionsJava;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        /*
         * // Cách 1
         * ArrayList<Kiểu dữ liệu> <name> = new ArrayList<>();
         * // Cách 2
         * List<Kiểu dữ liệu> <name> = new ArrayList<>();
         * 
         * 
         * Note: Các kiểu dữ liệu nguyên thuỷ không được phép trong ArrayList.
         * 
         * List<int> arrs = new ArrayList<>(); => Error
         * Trong Java có 8 dữ liệu nguyên thuỷ bao gồm
         * 
         * byte: kiểu dữ liệu byte có kích thước 8-bit.
         * short: kiểu dữ liệu short có kích thước 16-bit.
         * int: kiểu dữ kiệu int có kích thước 32-bit.
         * long: kiểu dữ kiệu long có kích thước 64-bit.
         * float: float là kiểu dữ liệu single-precision 32-bit.
         * double: double là kiểu dữ liệu double-precision 64-bit.
         * char: char kiểu dữ liệu single 16-bit Unicode character,
         * 
         */

        List<String> strs = new ArrayList<>();
        strs.add("str 0");
        strs.add("str 1");
        strs.add("str 2");

        // thêm phần tử vào cuối arraylist
        strs.add("str 3");
        System.out.println(strs);

        // Thêm phần tử tại vị trí được chỉ định
        strs.add(2, "deft");
        System.out.println(strs);

        System.out.println();
        // remove by value
        strs.remove("str 0");
        System.out.println(strs);
        // remove by index
        strs.remove(2);
        System.out.println(strs);


        // array for
        for(int i = 0; i < strs.size(); i++) {
            System.out.println(strs.get(i));
        }

        // for rút gọn
        for (String str : strs) {
            System.out.println(str);
        }

        // for each
        strs.forEach(str -> System.out.println(str));

        /*
        1, boolean add(Object o): Thêm một phần tử vào ArrayList
        obj.add("deft");

        2, boolean add(int index, Object o): Thêm một phần tử vào vị trí index. Nếu index không hợp lệ chúng ta sẽ nhận lại một IndexOutOfBoundsException.
        obj.add(2, "deft");

        3, boolean remove(Object o): Xoá object o khỏi ArrayList, object o này phải chứa trong ArrayList.
        obj.remove("deft");

        4, boolean remove(int index): Xoá một phần tử tại vị trí index, nếu index không hợp lệ chúng ta sẽ nhận IndexOutOfBoundsException.
        obj.remove(3);

        5, Object set(int index, Object o): Cập nhật phần tử tại vị trí index, nếu index không hợp lệ chúng ta sẽ nhận IndexOutOfBoundsException.
        obj.set(3, "update");

        6, int indexOf(Object o): Lấy vị trí index của object o trong ArrayList, nếu object o không chứa trong ArrayList nhận kết -1.
        int pos = obj.indexOf("deft);

        7, Object get(int index): Return object tại vị trí index trong ArrayList.
        String str = obj.get(3);

        8, int size(): lấy số lượng phần tử chứa trong ArrayList
        int size = obj.size();

        9, boolean contains(Object o): Kiểm tra phần tử object o có chứa trong ArrayList, nếu có return true, ngược lại false.
        boolean isExist = obj.contains("deft");

        10, void clear(): Xoá tất cả các phần tử trong ArrayList
        obj.clear();
        
        11, int lastIndexOf(): Lấy vị trí xuất hiện cuối cùng của phần tử.
        */

    }
}
