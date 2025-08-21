package CollectionFramework;
import java.util.ArrayDeque;
import java.util.Deque;

public class dequeExample {
    public static void main(String args[]) {
        ArrayDeque dq = new ArrayDeque();
        dq.add(0);
        dq.offer(10);
        dq.offer(20);
        dq.offer(30);
        dq.offer(40);
        dq.offer(50);
        System.out.println(dq);

        // Removing elements from the head fifo
        dq.poll();
        System.out.println(dq);


        dq.addFirst(1);
        dq.addLast(5);
        System.out.println(dq);


        // Using as Stack (LIFO)
        dq.push(999); // Adds to the front (like stack push)
        dq.push(888);
        System.out.println(dq);

        dq.removeFirst();
        System.out.println(dq);

        dq.removeLast();
        System.out.println(dq);

        dq.pop();//removes first
        System.out.println(dq);
    }
}
