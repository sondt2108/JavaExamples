package exampleArr;

import java.util.Arrays;

public class arrOutput {
    public static void main(String[] args) {
        System.out.println("=====================Array output=========================");

        String[] greeting = new String[3];
        greeting[0] = "This is the greeting";
        greeting[1] = "for all the readers from";
        greeting[2] = "Java Source .";

        for (int i = 0; i < greeting.length; i++) {
            System.out.println(greeting[i]);
        }

        String[] arrStr = new String[] { "Tutorials", "Point", ".com" };

        //  toString() của mảng được sử dụng để hiển thị tất cả các phần tử của một mảng.
        System.out.println(Arrays.toString(arrStr));

        String[][] deepArr = new String[][] { { "Sai", "Gopal" }, { "Pallavi", "Priya" } };
        System.out.println(Arrays.toString(deepArr)); // no output

        //  Arrays.deepToString () được sử dụng để nhận được biểu diễn chuỗi của các mảng đa chiều.
        System.out.println(Arrays.deepToString(deepArr));
    }
}
