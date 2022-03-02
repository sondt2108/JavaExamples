package methods;

class MyClass {
    int height;

    MyClass() {
        System.out.println("bricks");
        height = 0;
    }

    MyClass(int i) {
        System.out.println("Building new House that is " + i + " feet tall");
        height = i;
    }

    void info() {
        System.out.println("House is " + height + " feet tall");
    }

    void info(String s) {
        System.out.println(s + ": House is " + height + " feet tall");
    }
}




public class methodsOverloading {

    void sum(int a, int b) {
        System.out.println(a + b);
    }

    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        MyClass myclass = new MyClass();
        myclass.info();
        myclass.info("overloaded method");

        new MyClass();

        methodsOverloading cal = new methodsOverloading();
        cal.sum(20, 30, 60);
        cal.sum(20, 20);


        int nDisks = 3;
      doTowers(nDisks, 'A', 'B', 'C');


      Integer[] integerArray = { 1, 2, 3, 4, 5, 6 };
      Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
      Character[] characterArray = { 'H', 'E', 'L', 'L', 'O' };
      
      System.out.println("Array integerArray contains:");
      printArray(integerArray);
      
      System.out.println("\nArray doubleArray contains:");
      printArray(doubleArray);
      
      System.out.println("\nArray characterArray contains:");
      printArray(characterArray);



      for (int counter = 0; counter <= 50; counter++){
        System.out.printf("Fibonacci of %d is: %d\n", counter, fibonacci(counter));
     }
    }



    public static void doTowers(int topN, char from, char inter, char to) {
        if (topN == 1) {
           System.out.println("Disk 1 from " + from + " to " + to);
        } else {
           doTowers(topN - 1, from, to, inter);
           System.out.println("Disk " + topN + " from " + from + " to " + to);
           doTowers(topN - 1, inter, from, to);
        }
     }



     public static void printArray(Integer[] inputArray) {
        for (Integer element : inputArray){
           System.out.printf("%s ", element);
           System.out.println();
        }
     }
     public static void printArray(Double[] inputArray) {
        for (Double element : inputArray){
           System.out.printf("%s ", element);
           System.out.println();
        }
     }
     public static void printArray(Character[] inputArray) {
        for (Character element : inputArray){
           System.out.printf("%s ", element);
           System.out.println();
        }
     }


     public static long fibonacci(long number) {
        if ((number == 0) || (number == 1)) return number;
        else return fibonacci(number - 1) + fibonacci(number - 2);
     }
}


/* 




*/