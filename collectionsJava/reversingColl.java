package collectionsJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class reversingColl {
    public static void main(String[] args) {
        String[] coins = { "A", "B", "C", "D", "E" };
        List l = new ArrayList();

        for (int i = 0; i < coins.length; i++)
            l.add(coins[i]);

        // ListIterator là một interface được sử dụng để duyệt các phần tử của List trong java.
        ListIterator liter = l.listIterator();
        System.out.println("Before reversal");
        // boolean hasNext() Phương pháp này trả về true nếu list interator có tồn tại phần tử kế tiếp phần tử hiện tại.
        while (liter.hasNext())
        // .next() trả về phần tử kế tiếp trong danh sách
            System.out.println(liter.next());

        // Collections.reverse được sử dụng để đảo ngược thứ tự của các phần tử trong danh sách được chỉ định..
        Collections.reverse(l);
        liter = l.listIterator();
        System.out.println("After reversal");
        while (liter.hasNext())
            System.out.println(liter.next());
    }
}
