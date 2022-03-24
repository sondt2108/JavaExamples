package thread;

public class ThreadEx2 {
    
    public static void main(String[] args) {

		Runnable r1 = new MyThread(true); // isOdd = true
		Runnable r2 = new MyThread(false);// isOdd = false
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}
}

class MyThread implements Runnable {
	private boolean isOdd;

	MyThread(boolean isOdd) {
		this.isOdd = isOdd;
	}

	public void run() {

		if (isOdd == true) {
			for (int i = 1; i < 11; i += 2) {
				System.out.println(i);
			}
		} else {
			for (int i = 2; i < 11; i += 2) {
				System.out.println(i);
			}
		}
	}
}

    
    


