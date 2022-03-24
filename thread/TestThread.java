package thread;

public class TestThread {
    public static void main(String[] args) {
        Printer printer = new Printer();

        MyRunnable r1 = new MyRunnable(true, printer);// isOdd = true
        Thread t1 = new Thread(r1);
        MyRunnable r2 = new MyRunnable(false, printer);// isOdd = false
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}

// khai báo đồng bộ trên phương thức tĩnh thì khi đó cùng 1 thời điểm chỉ có 1 thread được thực thi trên 1 class

class Printer {
    private boolean isOdd = false;

    public void printEven(int number) {
        // 1: number = 2, isOdd = false => wait();
        synchronized (this) {
            if (isOdd == false) {
                try {
                    wait();
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
            }
            System.out.println("even : " + number);
            isOdd = false;
            notifyAll();
        }
    }

    public void printOdd(int number) {
        synchronized (this) {
            // 1 : number = 1, isOdd = false => print -> 1 => isOdd = true => Đánh thức hàm
            // printEven() đang chờ : (isOdd = true => print number = 2 => isOdd = false)
            // 2 : number = 3, isOdd = false => print -> 3 => isOdd = true => Đánh thức hàm
            // printEven() đang chờ : (isOdd = true => print number = 4 => isOdd = false)
            // 3 : number = 5, isOdd = false => print -> 5 => isOdd = true => Đánh thức hàm
            // printEven() đang chờ : (isOdd = true => print number = 6 => isOdd = false)
            // 4 : number = 7, isOdd = false => print -> 7 => isOdd = true => Đánh thức hàm
            // printEven() đang chờ : (isOdd = true => print number = 8 => isOdd = false)
            // 5 : number = 9, isOdd = false => print -> 9 => isOdd = true => Đánh thức hàm
            // printEven() đang chờ : (isOdd = true => print number = 10 => isOdd = false)

            if (isOdd == true) {
                try {
                    wait();
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
            }
            System.out.println("odd : " + number);
            isOdd = true;
            System.out.println("isOdd----------------------->4 :" + isOdd);
            notifyAll();
        }
    }
}

class MyRunnable implements Runnable {

    private boolean isOdd;
    Printer printer;

    MyRunnable(boolean isOdd, Printer printer) {
        this.isOdd = isOdd;
        this.printer = printer;
    }

    public void run() {
        // nếu = true thì number = 1 và = false thì number = 2
        for (int number = isOdd == true ? 1 : 2; number < 11; number += 2) {
            if (isOdd) {
                // isOdd = true
                // number = 2 -> 4 -> 6 -> 8 -> 10
                printer.printOdd(number);

            } else {

                // isOdd = false
                // number = 1 -> 3 -> 5 -> 7 -> 9
                printer.printEven(number);

            }
        }
    }
}
