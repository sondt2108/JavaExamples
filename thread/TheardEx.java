package thread;

public class TheardEx {
    public static void main(String[] args) {
        System.out.println("start");
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
               for (int i = 0; i < 20; i++) {
                   System.out.println("theard 1--->" + i);
               }
                
            }
        });

        t.start(); // chạy luồng

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
               for (int i = 0; i < 20; i++) {
                   System.out.println("theard 2--->" + i);
               }
                
            }
        });

        t2.start();

        // lamda
        new Thread(() -> {
           for (int i = 0; i < 20; i++) {
               System.out.println("theard 2--->" + i);
           }
            
        }).start();
        System.out.println("end");
    }
}
