package exampleString;

public class replaceJava {

    public static void main(String[] args) {
        System.out.println("=============Replace================");
        String str = "hello java ";
        // replace() được sử dụng để thay thế tất cả các ký tự hoặc chuỗi cũ thành ký tự hoặc chuỗi mới.
        System.out.println("replace: " + str.replace('H', 'W'));
        // replaceFirst() sẽ tìm và thay thế chuỗi con đầu tiên trong chuỗi ban đầu bằng
        // chuỗi truyền vào.
        System.out.println("replaceFirst: " + str.replaceFirst("He", "Wa"));
        // replaceAll() trả về một chuỗi bằng cách thay thế tất cả ký tự khớp với chuỗi
        // truyền vào.
        System.out.println("replaceAll" + str.replaceAll("He", "Ha"));
    }
}
