package methods;

public class varargs {
    static int sumvarargs(int... intArrays) {
        int sum, i;
        sum = 0;
        for (i = 0; i < intArrays.length; i++) {
            sum += intArrays[i];
        }
        return (sum);
    }

    //

    static void display(String... values) {
        System.out.println("display method invoked ");
        for (String s : values) {
            System.out.println(s);
        }
    }

    //

    static void vaTest(int... no) {
        System.out.print(
                "vaTest(int ...): " + "Number of args: " + no.length + " Contents: ");
        for (int n : no)
            System.out.print(n + " ");
        System.out.println();
    }

    static void vaTest(boolean... bl) {
        System.out.print(
                "vaTest(boolean ...) " + "Number of args: " + bl.length + " Contents: ");
        for (boolean b : bl)
            System.out.print(b + " ");
        System.out.println();
    }

    static void vaTest(String msg, int... no) {
        System.out.print(
                "vaTest(String, int ...): " + msg + "no. of arguments: " + no.length + " Contents: ");
        for (int n : no)
            System.out.print(n + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        int sum = 0;
        sum = sumvarargs(new int[] { 10, 12, 33 });
        System.out.println("The sum of the numbers is: " + sum);

        //

        display();
        display("Tutorialspoint");
        display("my", "name", "is", "Sairamkrishna Mammahe");

        //

        vaTest(1, 2, 3);
        vaTest("Testing: ", 10, 20);
        vaTest(true, false, false);

    }

}
