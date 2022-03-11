package exampleString;

public class compareToJava {

    public static void main(String[] args) {
        String str = "hello java ";
        String anotherString = "Hello java";


        System.out.println("=============compareTo================");

        // //compareTo() so sánh các chuỗi cho trước với chuỗi hiện tại theo thứ tự từ điển.

        System.out.println(str.compareTo(anotherString));
        System.out.println(str.compareToIgnoreCase(anotherString)); // Không phân biệt chữ thường và chữ hoa
    }

}
