package exampleString;

public class unicodeStringJava {
    public static void main(String[] args) {
        System.out.println("=============String unicode================");

        String test_string = "Welcome to TutorialsPoint";
        System.out.println("String under test is = " + test_string);

        System.out.println("Unicode code point at"
                + " position 5 in the string is = "
                + test_string.codePointAt(0));
    }
}
