package collectionsJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// xáo trộn các phần tử
public class collShuffle {
    public static void main(String[] args) {
        List<String> obj = new ArrayList<String>();
      obj.add("A");
      obj.add("E");
      obj.add("I");
      obj.add("O");
      obj.add("U");
    // Collections.shuffle sắp xếp danh sách ngẫu nhiên
      Collections.shuffle(obj);
      System.out.println(obj);

    }
}
