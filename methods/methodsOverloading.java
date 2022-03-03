package methods;

import java.util.ArrayList;
import java.util.Vector;

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

class Figure {
   double dim1;
   double dim2;

   Figure(double a, double b) {
      dim1 = a;
      dim2 = b;
   }

   Double area() {
      System.out.println("Inside area for figure.");
      return (dim1 * dim2);
   }
}

class Rectangle extends Figure {
   Rectangle(double a, double b) {
      super(a, b);
   }

   Double area() {
      System.out.println("Inside area for rectangle.");
      return (dim1 * dim2);
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

      // ***********************************************************************
      System.out.println();
      System.out.println("Method Overloading:");

      MyClass myclass = new MyClass();
      myclass.info();
      myclass.info("overloaded method");

      new MyClass();

      //
      methodsOverloading cal = new methodsOverloading();
      cal.sum(20, 30, 60);
      cal.sum(20, 20);

      // ***********************************************************************
      System.out.println();
      System.out.println("Solving Tower of Hanoi:");

      int nDisks = 3;
      doTowers(nDisks, 'A', 'B', 'C');

      // ***********************************************************************
      System.out.println();
      System.out.println("Printing Array using Method:");

      Integer[] integerArray = { 1, 2, 3, 4, 5, 6 };
      Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
      Character[] characterArray = { 'H', 'E', 'L', 'L', 'O' };

      System.out.println("Array integerArray contains:");
      printArray(integerArray);

      System.out.println("\nArray doubleArray contains:");
      printArray(doubleArray);

      System.out.println("\nArray characterArray contains:");
      printArray(characterArray);

      // ***********************************************************************
      System.out.println();
      System.out.println("Calculating Fibonacci Series:");

      for (int counter = 0; counter <= 20; counter++) {
         System.out.printf("Fibonacci of %d is: %d\n", counter, fibonacci(counter));
      }

      //

      int count = 15;
      int[] feb = new int[count];
      feb[0] = 0;
      feb[1] = 1;

      for (int i = 2; i < count; i++) {
         feb[i] = feb[i - 1] + feb[i - 2];
      }
      for (int i = 0; i < count; i++) {
         System.out.print(feb[i] + " ");
      }

      // ***********************************************************************
      System.out.println();
      System.out.println("Calculating Factorial:");

      int number = 5;
      int factorial = number;

      for (int i = (number - 1); i > 1; i--) {
         factorial = factorial * i;
      }
      System.out.println("Factorial of 5 is " + factorial);

      //

      for (int counter = 0; counter <= 10; counter++) {
         System.out.printf("%d! = %d\n", counter, factorial(counter));
      }

      // ***********************************************************************
      System.out.println();
      System.out.println("Method Overriding:");

      Figure f = new Figure(10, 10);
      Rectangle r = new Rectangle(9, 5);
      Figure figref;
      figref = f;
      System.out.println("Area is :" + figref.area());
      figref = r;
      System.out.println("Area is :" + figref.area());

      // ***********************************************************************
      System.out.println();
      System.out.println("Printing Array using Method:");

      Object testObject = new ArrayList();
      displayObjectClass(testObject);

      // ***********************************************************************
      System.out.println();
      System.out.println("Use of break statement:");

      int[] intary = { 99, 12, 22, 34, 45, 67, 5678, 8990 };
      int no = 5678;
      int i = 0;
      boolean found = false;

      for (; i < intary.length; i++) {
         if (intary[i] == no) {
            found = true;
            break;
         }
      }
      if (found) {
         System.out.println("Found the no: " + no + " at  index: " + i);
      } else {
         System.out.println(no + "not found  in the array");
      }


      // ***********************************************************************
      System.out.println();
      System.out.println("Use of continue:");


      StringBuffer searchstr = new StringBuffer(
         "hello how are you. ");
      int length = searchstr.length();
      int count1 = 0;
      
      for (int i1 = 0; i1 < length; i1++) {
         if (searchstr.charAt(i1) != 'h')continue;
         count1++;
         searchstr.setCharAt(i1, 'h');
      }
      System.out.println("Found " + count1 + " h's in the string.");
      System.out.println(searchstr);

// 
      for(int ctn = 1; ctn <= 10; ctn++) {
         if(ctn == 5) {
            continue;  
         }
         System.out.println(ctn);
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
      for (Integer element : inputArray) {
         System.out.printf("%s ", element);
         System.out.println();
      }
   }

   public static void printArray(Double[] inputArray) {
      for (Double element : inputArray) {
         System.out.printf("%s ", element);
         System.out.println();
      }
   }

   public static void printArray(Character[] inputArray) {
      for (Character element : inputArray) {
         System.out.printf("%s ", element);
         System.out.println();
      }
   }

   public static long fibonacci(long number) {
      if ((number == 0) || (number == 1))
         return number;
      else
         return fibonacci(number - 1) + fibonacci(number - 2);
   }

   public static long factorial(long number) {
      if (number <= 1)
         return 1;
      else
         return number * factorial(number - 1);
   }

   public static void displayObjectClass(Object o) {
      if (o instanceof Vector)
         System.out.println(
               "Object was an instance of the class java.util.Vector");
      else if (o instanceof ArrayList)
         System.out.println(
               "Object was an instance of the class java.util.ArrayList");
      else
         System.out.println("Object was an instance of the " + o.getClass());
   }
}

/* 




*/