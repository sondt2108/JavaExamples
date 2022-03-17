package collectionsJava;

import java.util.LinkedList;
import java.util.Queue;

/**
 * QueueEx
 * Khởi tạo Queue
Queue là một interface nên chúng ta không thể khởi tạo, mà phải khởi tạo các implement của nó như LinkedList, PriorityQueue.
Queue q1 = new LinkedList();
Queue q2 = new PriorityQueue();
 */
public class QueueEx {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        //Adding elements to the Queue
        q.add(1);
        q.add(100);
        q.add(99);
        q.add(46);
        q.add(90);
        System.out.println("Elements in Queue:"+q);
        System.out.println("Removed element: "+q.remove());
        System.out.println("Head: "+q.element());
        System.out.println("poll(): "+q.poll());
        System.out.println("peek(): "+q.peek());
        System.out.println("Elements in Queue:"+q);
    }
}

/**
 * boolean add(E e): Thêm phần tử vào Queue. Nếu thêm thành công trả về true, ngược lại false.

E element(): Trả về phần tử đầu tiên của Queue.

boolean offer(object): Tương tự add().

E remove(): Xoá phần tử đầu tiên của Queue.

E poll(): Tương tự remove(), điểm khác nhau giữa poll() và remove(), poll() trả về null khi Queue rỗng còn remove() quăng exception NoSuchElementException.

E peek(): Tương tự element() điểm khác nhau giữa peek() và element() là peek() trả về null nếu Queue rỗng, element() quăng NoSuchElementException
 */