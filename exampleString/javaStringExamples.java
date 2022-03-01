package exampleString;

/**
 * stringCompare
 */
public class javaStringExamples {

    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
        // cắt phần tử ở vị trí thứ 3 + chuổi từ phần tử thứ 4
    }

    public static void main(String[] args) {
        String str = "Hello java";
        String anotherString = "hello java";
        Object objStr = str;

        System.out.println("=============compareTo================");

        System.out.println(str.compareTo(anotherString));
        System.out.println(str.compareToIgnoreCase(anotherString));
        System.out.println(str.compareTo(objStr.toString()));

        System.out.println("=============Equals================");
        // equals

        String s1 = "tutorialspoint";
        String s2 = "tutorialspoint";
        String s3 = new String("Tutorials Point");
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));

        System.out.println("=============String compare by == operator================");
        // String compare by == operator
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);

        System.out.println("=============Replace================");
        // replace
        System.out.println("replace: " + str.replace('H', 'W'));
        // replaceFirst() sẽ tìm và thay thế chuỗi con đầu tiên trong chuỗi ban đầu bằng
        // chuỗi truyền vào.
        System.out.println("replaceFirst: " + str.replaceFirst("He", "Wa"));
        // replaceAll() trả về một chuỗi bằng cách thay thế tất cả ký tự khớp với chuỗi
        // truyền vào.
        System.out.println("replaceAll" + str.replaceAll("He", "Ha"));

        System.out.println("=============Revese================");
        // revese String

        StringBuilder input = new StringBuilder();

        input.append(str);
        System.out.println("String before reverse: " + input);

        input.reverse();

        System.out.println("String after reverse: " + input);

        System.out.println("=============removeCharAt================");

        System.out.println(removeCharAt(str, 3));

        System.out.println("=============lastIndexOf================");

        String strOrig1 = "Hello world ,Hello Reader";
        int lastIndex = strOrig1.lastIndexOf("Hello");

        // nếu k tìm thấy trả về = -1
        if (lastIndex == -1) {
            System.out.println("Hello not found");
        } else {
            System.out.println("Last occurrence of Hello is at index " + lastIndex);
        }

        System.out.println("=============IndexOf================");

        String strOrig = "Hello readers";
        int intIndex = strOrig.indexOf("Hello");

        if (intIndex == -1) {
            System.out.println("Hello not found");
        } else {
            System.out.println("Found Hello at index " + intIndex);
        }

        System.out.println("=============contains================");
        // contains
        System.out.println(strOrig.contains("re"));

        System.out.println("=============Split================");

        String str1 = "t u t o r i a l s";

        System.out.println();
        String[] words = str1.split("\\s");
        for (String w : words) {
            System.out.println(w);
        }

        System.out.println("=============uppercase================");

        String strUpper = str.toUpperCase();
        System.out.println("Original String: " + str);
        System.out.println("String changed to upper case: " + strUpper);

        System.out.println("=============String region match================");

        String first_str = "Welcome to Microsoft";
        String second_str = "I work with Microsoft";
        boolean match = first_str.regionMatches(11, second_str, 12, 9);
        System.out.println("first_str[11 -19] == " + "second_str[12 - 21]:" + match);

        System.out.println("=============Comparing performance================");
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 50000; i++) {
            String s5 = "hello";
            String s6 = "hello";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken for creation"
                + " of String literals : " + (endTime - startTime)
                + " milli seconds");
        long startTime1 = System.currentTimeMillis();

        for (int i = 0; i < 50000; i++) {
            String s7 = new String("hello");
            String s8 = new String("hello");
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("Time taken for creation"
                + " of String objects : " + (endTime1 - startTime1)
                + " milli seconds");

        System.out.println(System.currentTimeMillis());

        System.out.println("=============String optimization================");

        String variables[] = new String[50000];
        for (int i = 0; i < 50000; i++) {
            variables[i] = "s" + i;
        }
        long startTime0 = System.currentTimeMillis();

        for (int i = 0; i < 50000; i++) {
            variables[i] = "hello";
        }
        long endTime0 = System.currentTimeMillis();
        System.out.println("Creation time"
                + " of String literals : " + (endTime0 - startTime0)
                + " ms");
        long startTime2 = System.currentTimeMillis();

        for (int i = 0; i < 50000; i++) {
            variables[i] = new String("hello");
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("Creation time of"
                + " String objects with 'new' key word : "
                + (endTime2 - startTime2)
                + " ms");
        long startTime3 = System.currentTimeMillis();

        for (int i = 0; i < 50000; i++) {
            // variables[i] = new String("hello");
            variables[i] = variables[i].intern();
        }
        long endTime3 = System.currentTimeMillis();
        System.out.println("Creation time of"
                + " String objects with intern(): "
                + (endTime3 - startTime3)
                + " ms");

        System.out.println("=============format strings================");

        String name = "Hello World";
        String strFormat1 = String.format("name %s", name);
        String strFormat2 = String.format("value %f", 32.33434);
        String strFormat3 = String.format("value %32.12f", 32.33434);
        System.out.print(strFormat1);
        System.out.print("\n");
        System.out.print(strFormat2);
        System.out.print("\n");
        System.out.print(strFormat3);
        System.out.print("\n");

        System.out.println("=============Concatenate Strings================");

        long startTime4 = System.currentTimeMillis();

        for (int i = 0; i < 5000; i++) {
            String result = "This is"
                    + "testing the"
                    + "difference" + "between"
                    + "String" + "and" + "StringBuffer";
        }
        long endTime4 = System.currentTimeMillis();
        System.out.println("Time taken for string"
                + "concatenation using + operator : "
                + (endTime4 - startTime4) + " ms");
        long startTime5 = System.currentTimeMillis();

        for (int i = 0; i < 5000; i++) {
            StringBuffer result = new StringBuffer();
            result.append("This is");
            result.append("testing the");
            result.append("difference");
            result.append("between");
            result.append("String");
            result.append("and");
            result.append("StringBuffer");
        }
        long endTime5 = System.currentTimeMillis();
        System.out.println("Time taken for String concatenation"
                + "using StringBuffer : "
                + (endTime5 - startTime5) + " ms");

        System.out.println("=============String unicode================");

        String test_string = "Welcome to TutorialsPoint";
        System.out.println("String under test is = " + test_string);

        System.out.println("Unicode code point at"
                + " position 5 in the string is = "
                + test_string.codePointBefore(5));

    }
}