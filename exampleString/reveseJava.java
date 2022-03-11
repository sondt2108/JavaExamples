package exampleString;

public class reveseJava {
    public static void main(String[] args) {
        System.out.println("=============Revese================");
        String str = "hello java ";
        // revese String (đảo ngược chuổi)

        // StringBuilder trong Java được sử dụng để tạo chuỗi có thể thay đổi
        StringBuilder input = new StringBuilder();

        input.append(str);
        System.out.println("String before reverse: " + input);

        input.reverse();

        System.out.println("String after reverse: " + input);
    }
}
