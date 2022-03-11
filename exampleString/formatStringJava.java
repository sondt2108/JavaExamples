package exampleString;

public class formatStringJava {
    public static void main(String[] args) {
        System.out.println("=============format strings================");

        String name = "Hello World";
        String strFormat1 = String.format("name %s", name);
        String strFormat2 = String.format("value %f", 32.33434);
        String strFormat3 = String.format("value %32.2f", 32.33434);
        System.out.print(strFormat1);
        System.out.print("\n");
        System.out.print(strFormat2);
        System.out.print("\n");
        System.out.print(strFormat3);
        System.out.print("\n");
    }
}
