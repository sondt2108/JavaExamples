package exampleString;

public class equalsJava {
    public static void main(String[] args) {
        System.out.println("=============Equals================");


        // equals() so sánh hai chuỗi đưa ra dựa trên nội dung của chuỗi. Nếu hai chuỗi khác nhau nó trả về false. Nếu hai chuỗi bằng nhau nó trả về true.

        String s1 = "tutorialspoint";
        String s2 = "tutorialspoint";
        String s3 = new String("Tutorialspoint"); //
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));


        System.out.println("=============String compare by == operator================");
        // String compare by == operator (So sánh chuổi bằng toán tử)
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
    }
}
