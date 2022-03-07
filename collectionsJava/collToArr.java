package collectionsJava;

import java.util.ArrayList;
import java.util.List;


// How to convert a collection into an array?
public class collToArr {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        // sử dụng phương thức add() để thêm phần tử cho mảng
        list.add("This ");
        list.add("is ");
        list.add("a ");
        list.add("good ");
        list.add("program.");
        // Tạo một đối tượng mảng
        String[] s1 = new String[list.size()]; // Độ dài của mảng
        //chuyển đổi thành mảng một chiều arr
        list.toArray(s1);
        for (int i = 0; i < s1.length; ++i) {
            String contents = s1[i];
            System.out.print(contents);
        }
    }
}
