package thread;

public class ThreadEx4 {
    public static void main(String[] args) {
        Printer1 printer = new Printer1();
        MyRunnable1 r1 = new MyRunnable1(true, printer);// isOdd = true
        Thread t1 = new Thread(r1);
        MyRunnable1 r2 = new MyRunnable1(false, printer);// isOdd = false
        Thread t2 = new Thread(r2);
        MyRunnable1 r3 = new MyRunnable1(false, printer);// isOdd = false
        Thread t3 = new Thread(r2);
        t1.start();
        t2.start();
        t3.start();
    }
}

class Printer1 {
    private boolean isOdd = false;

    int sum = 0;

    public void printSumForLoop(int number) {
        // 1: number = 2, isOdd = false => wait();
        synchronized (this) {
            System.out.println(Thread.currentThread().getName());
            if (isOdd == false) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            int println = sum += number;
            System.out.println("Theard B sum = " + println);
            isOdd = false;
            notify();
        }
    }

    public void printLoop(int number) {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName());
            if (isOdd == true) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Thread A loop: " + number);
            isOdd = true;
            System.out.println(Thread.currentThread().getName());
            printSumForLoop(number);
            notify();
            // isPrint = true;
            // printSumResult();
        }
    }

    public void printSumResult() {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName());
                    notifyAll();
            System.out.println("Thread C result :"+sum);
            //notifyAll();
        }
    }
}

class MyRunnable1 implements Runnable {

    private boolean isOdd;
    Printer1 printer;

    MyRunnable1(boolean isOdd, Printer1 printer) {
        this.isOdd = isOdd;
        this.printer = printer;
    }

    public void run() {

        if (isOdd) {
            for (int number = 0; number < 11; number++) {
                System.out.println(Thread.currentThread().getName());
                printer.printLoop(number);
                // printer.printSumForLoop(number);
            }
            printer.printSumResult();
        } 
        // printer.printEven(number);
    }
}
